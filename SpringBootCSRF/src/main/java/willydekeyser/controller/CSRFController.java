package willydekeyser.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CSRFController {

	@PostMapping("/javascript01")
	public String javascript01() {
		return "Javascript 01";
	}
}
