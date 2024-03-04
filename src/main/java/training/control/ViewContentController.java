package training.control;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import training.dto.ContentDTO;
import training.entities.Content;
import training.entities.Member;
import training.serviceImp.ContentServiceImp;
import training.util.DateUtils;

@Controller
// vì sao khi commemt li thì không chay
//@SessionAttributes("member")
public class ViewContentController {
	@Autowired
	ContentServiceImp contentService;

//	@GetMapping("/content")
	@GetMapping("/ViewControl")
	public String showViewContent(Model model, @SessionAttribute("member") Member validMember) {
		List<Content> contentList = contentService.getAllContentByMember(validMember);
		model.addAttribute("contentlist", contentList);
		return "ViewContent";
	}

	@GetMapping("/search")
	public String searchContent(Model model, @SessionAttribute("member") Member validMember,
			@RequestParam(defaultValue = "", value = "searchValue") String searchValue) {
		List<Content> contentList = contentService.getContentByString(validMember,searchValue);
		model.addAttribute("contentlist", contentList);
		return "ViewContent";

	}
	@GetMapping("/update")
	public String showUpdateContent(@RequestParam("id") Long id,Model model, @SessionAttribute("member") Member validMember) {
		//get the content form db
		Content content = contentService.getContentById(id,validMember);
		//clone dto of content?
//		ContentDTO contentDTO = new ContentDTO(content.getTitle(), content.getBrief(), content.getContent());
		//show dto to view
		model.addAttribute("contentForm",content);
		//recive dto
		//copy value to the content
		//update date
		//save to db
		return "AddContent";
	}
	@GetMapping("/delete")
	public String deleteContent(@RequestParam("id") Long id,Model model, @SessionAttribute("member") Member validMember) {
		contentService.deleteContentById(id,validMember);
		return "redirect:/ViewControl";
		
	}
}
