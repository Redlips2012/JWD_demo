package training.daoimp;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import training.dto.MemberUpdateDTO;
import training.entities.Member;

@Repository
public class MemberDAOimp {

	@Autowired
	SessionFactory factory;

	public Member getMember(String email, String password) {
		Session session = factory.getCurrentSession();
		String hql = "From Member where email= :email And password = :password";
		Query query = session.createQuery(hql);
		query.setParameter("email", email);
		query.setParameter("password", password);
		List<Member> result = query.list();
		if (result.size() > 0) {
			Member member = (Member) result.get(0);
			return member;
		} else {
			return null;
		}
	}

	public void persist(Member member) {
		Session session = factory.getCurrentSession();
		session.persist(member);
	}

	public void saveMember(@Valid Member member) {
		Session session = factory.getCurrentSession();
		session.save(member);
	}

	public void updateMemberInfo(Member member) {
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(member);
		
	}
	public void updateMember(Member member, MemberUpdateDTO memberUpdateDTO) {
		Session session = factory.getCurrentSession();
		String descriptionValue = memberUpdateDTO.getDescription().trim();
		String firstNameValue = memberUpdateDTO.getFirstName().trim();
		String lastNameValue = memberUpdateDTO.getLastName().trim();
		String phoneValue = memberUpdateDTO.getPhone().trim();
		if (descriptionValue.length() > 0) {
			member.setDescription(descriptionValue);
		}
		if (firstNameValue.length() > 0) {
			member.setFirstName(firstNameValue);
		}
		if (lastNameValue.length() > 0) {
			member.setLastName(lastNameValue);
		}
		if (phoneValue.length() > 0) {
			member.setPhone(phoneValue);
		}
		session.saveOrUpdate(member);
	}
}
