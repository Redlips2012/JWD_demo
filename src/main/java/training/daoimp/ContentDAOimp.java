package training.daoimp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import training.entities.Content;
import training.entities.Member;
import training.util.DateUtils;

@Repository
public class ContentDAOimp {
	@Autowired
	SessionFactory factory;

	public List<Content> getAllContentByMember(Member member) {

		List<Content> contents = new ArrayList<Content>();
		Session session = factory.getCurrentSession();

		System.out.println(member);
		System.out.println(session.isConnected());
		String hql = "From Content c Where c.authorId.id = :memberId";
		Query query = session.createQuery(hql);
		query.setParameter("memberId", member.getId());
		List<Content> result = query.list();
		for (Object object : result) {
			Content content = (Content) object;
			contents.add(content);
		}
		return result;

	}

	public void saveOrUpdate(Content content) {
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(content);
	}

	public List<Content> getContentByString(Member validMember, String searchValue) {
		Session session = factory.getCurrentSession();
		List<Content> contents = null;
		String hql = "From Content Where authorId = :authorIdValue AND " + "(" + "title LIKE :titleValue OR "
				+ "brief LIKE :briefValue)";
		Query query = session.createQuery(hql);
		query.setParameter("authorIdValue", validMember);
		query.setParameter("titleValue", "%" + searchValue + "%");
		query.setParameter("briefValue", "%" + searchValue + "%");
		contents = query.list();

		return contents;
	}

	public Content getContentById(Long id, Member member) {
		Session session = factory.getCurrentSession();
		Content content;
		String hql = "From Content Where id = :idValue And authorId = :member";
		Query query = session.createQuery(hql);
		query.setParameter("idValue", id);
		query.setParameter("member", member);
		List<Content> contents = query.list();
		if (contents.size() == 0) {
			return null;
		}
		return (Content) contents.get(0);
	}

	public void deleteContentById(Long id, Member member) {
		Session session = factory.getCurrentSession();
		String hql = "Delete Content Where id = :idValue And authorId = :member";
		Query query = session.createQuery(hql);
		query.setParameter("idValue", id);
		query.setParameter("member", member);
		query.executeUpdate();
	}
}
