package training.control;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import training.dto.ContentDTO;
import training.entities.Content;
import training.entities.Member;
import training.serviceImp.ContentServiceImp;

@Controller
//@RequestMapping() không nên có request mapping ở đây
public class FormContentControl {

	@Autowired
	ContentServiceImp contentServiceImp;

	@GetMapping("/form")
	public String showAddForm(Model model) {
		Content content = new Content();
		model.addAttribute("contentForm",content );
		return "AddContent";
	}

	@PostMapping("/save")
	public String newFrom(@ModelAttribute("contentForm") @Valid Content content, BindingResult result,
			@SessionAttribute("member") Member member) {
		if (result.hasErrors()) {
			return "AddContent";
		}
//		Content contentFromdb = contentServiceImp.getContentById(content.getId(), member);
//		contentServiceImp.setUpdateAttribute(contentFromdb,content);
		contentServiceImp.saveOrUpdate(member, content);
		return "redirect:/ViewControl";
	}

}
