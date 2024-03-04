package training.serviceImp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import training.daoimp.ContentDAOimp;
import training.entities.Content;
import training.entities.Member;

@Service
//@SessionAttributes("member")
public class ContentServiceImp {

	@Autowired
	ContentDAOimp ContentDAOimp;

	@Transactional
	public List<Content> getAllContentByMember(Member member) {
		return ContentDAOimp.getAllContentByMember(member);

	}

	@Transactional
	public void saveOrUpdate(Member member, Content content) {
		
		content.setCreatedDate(LocalDate.now());
		content.setSort(null);
		content.setUpdateTime(LocalTime.now());
		content.setAuthorId(member);
		ContentDAOimp.saveOrUpdate(content);
	}
	@Transactional

	public List<Content> getContentByString(Member validMember, String searchValue) {
		return 	ContentDAOimp.getContentByString( validMember,  searchValue);
	
	}
	@Transactional
	public Content getContentById(Long id, Member validMember) {
		return ContentDAOimp.getContentById(id,validMember);
	}
	@Transactional
	public void deleteContentById(Long id, Member validMember) {

		ContentDAOimp.deleteContentById( id,  validMember) ;
	}

//	public void setUpdateAttribute(Content contentFromdb, @Valid Content content) {
//		contentFromdb.setTitle(content.getTitle());
//		contentFromdb.setBrief(content.getBrief());
//		contentFromdb.setContent(content.getContent());
//		
//	}

}
