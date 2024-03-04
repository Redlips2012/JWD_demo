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

import training.dto.UserLoginDTO;
import training.entities.Member;
import training.serviceImp.MemberServiceImp;

@Controller
@SessionAttributes("memberCheck")
@RequestMapping("/LoginPage")
public class LoginController {

	@Autowired
	MemberServiceImp memberServiceImp;

	@ModelAttribute("memberCheck")
	public UserLoginDTO userLoginDTO() {
		return new UserLoginDTO();
	}

	@GetMapping()
	public String Login(Model model) {
		model.addAttribute("memberCheck",new UserLoginDTO());
		return "LoginPage";
	}

	@PostMapping()
	public String doLogin( Model model,@ModelAttribute("memberCheck") @Valid UserLoginDTO userLoginDTO, BindingResult result) {
		if(result.hasErrors()) {
			return "LoginPage";
		}
		Member Vaildmember= memberServiceImp.getMember(userLoginDTO.getEmail(), userLoginDTO.getPassword());
		if (Vaildmember.getEmail() == null) {
			return "LoginPage";
		}
//		userLoginDTO.copyMember(Vaildmember);
		System.out.println(userLoginDTO);
		return "redirect:/buildMember";
	}

}
