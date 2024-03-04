package training.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.view.RedirectView;

import training.dto.UserLoginDTO;
import training.entities.Member;
import training.serviceImp.MemberServiceImp;

@Controller
@RequestMapping("/buildMember")
@SessionAttributes("member")
public class BuildMemberControl {
	@Autowired
	MemberServiceImp memberServiceImp;


	@ModelAttribute("member")
	public Member member(@SessionAttribute("memberCheck")UserLoginDTO userLoginDTO ) {
		System.out.println(userLoginDTO);
		return memberServiceImp.getMember(userLoginDTO.getEmail(), userLoginDTO.getPassword());
	}
	@GetMapping()
	public String redirectToIdle() {
        return "Idle";
    }
}
