package training.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeControl {

	
	@GetMapping("/")
	public RedirectView redirectToLogin() {
        return new RedirectView("LoginPage");
    }
	
}
