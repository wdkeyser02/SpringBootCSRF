package willydekeyser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@PostMapping("/form01")
	public String form1(Model model) {
		System.err.println("Submit FORM");
		model.addAttribute("text01", "Submit Form 01");
		return "index";
	}
	
	@PostMapping("/form02")
	public String form2(Model model) {
		System.err.println("Submit FORM");
		model.addAttribute("text02", "Submit Form 02");
		return "index";
	}
}
