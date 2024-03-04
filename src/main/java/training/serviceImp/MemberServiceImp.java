package training.serviceImp;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import training.daoimp.MemberDAOimp;
import training.dto.MemberSignUpDTO;
import training.dto.MemberUpdateDTO;
import training.entities.Member;

@Service
public class MemberServiceImp {

	@Autowired
	MemberDAOimp memberDAOimp;

	@Transactional
	public Member getMember(String userName, String password) {
		return memberDAOimp.getMember(userName, password);
	}

	@Transactional
	public void persist(Member member) {
		memberDAOimp.persist(member);
	}

	@Transactional
	public void saveMember(MemberSignUpDTO MemberSignUpDTO) {
		Member member = new Member();
		member.setUserName(MemberSignUpDTO.getUserName());
		member.setEmail(MemberSignUpDTO.getEmail());
		member.setPassword(MemberSignUpDTO.getPassword());
		member.setCreatedDate(LocalDate.now());
		member.setUpdateTime(LocalTime.now());
		memberDAOimp.saveMember(member);
	}
@Transactional
	public void updateMember(Member member, MemberUpdateDTO memberUpdateDTO) {
		memberDAOimp.updateMember(member, memberUpdateDTO);
	}


}
