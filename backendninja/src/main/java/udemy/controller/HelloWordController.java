package udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/say")
public class HelloWordController {

	@GetMapping("/hello")
	public String HelloWorld() {
		return "helloworld";
	}
}
