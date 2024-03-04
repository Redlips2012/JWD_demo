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
import org.springframework.web.bind.annotation.RequestParam;

import training.dto.MemberSignUpDTO;
import training.entities.Member;
import training.serviceImp.MemberServiceImp;

@Controller
@RequestMapping("/SignUp")
public class SignUpController {

	@Autowired
	MemberServiceImp memberServiceImp;

	@GetMapping()
	public String getMember(Model model) {
		model.addAttribute("NewMember", new MemberSignUpDTO());
		return "SignUp";
	}

	@PostMapping("/save")
	public String saveMember(@ModelAttribute("NewMember") @Valid MemberSignUpDTO MemberSignUpDTO, 
			BindingResult result) {
//		if(result.hasErrors()) {
//			return "SignUp";
//		}
		if(!MemberSignUpDTO.getPassword().equals(MemberSignUpDTO.getRePassword())) {
			return "SignUp";
		}
		memberServiceImp.saveMember(MemberSignUpDTO);
		return "redirect:/LoginPage";

	}
}
