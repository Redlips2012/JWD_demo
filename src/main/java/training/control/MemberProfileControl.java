package training.control;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import training.dto.MemberUpdateDTO;
import training.entities.Member;
import training.serviceImp.MemberServiceImp;

@Controller
@SessionAttributes("member")
@RequestMapping("/memberUpdate")
public class MemberProfileControl {
	@Autowired
MemberServiceImp memberServiceImp;
//	@ModelAttribute("memberUpdate")
//	public MemberUpdateDTO memberUpdate() {
//		return new MemberUpdateDTO();
//	}
	@GetMapping()
	public String showUpdate(Model model,@SessionAttribute("member") Member member) {
		MemberUpdateDTO memberUpdateDTO =new MemberUpdateDTO(member.getFirstName(),member.getLastName(),member.getPhone(),member.getDescription());
		model.addAttribute("memberUpdateDTO", memberUpdateDTO);
		return "UpdateMemberForm";
	}

	@PostMapping()
	public String updateToDB(@SessionAttribute("member") Member member,@ModelAttribute("memberUpdateDTO") @Valid MemberUpdateDTO memberUpdateDTO,
			BindingResult result) {
		if(result.hasErrors()) {
			return "UpdateMemberForm";
		}
		memberServiceImp.updateMember(member,memberUpdateDTO);
		return "Idle";

	}
}
