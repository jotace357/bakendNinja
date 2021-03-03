package udemy.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class Example4Controller {
	
	private static final String RESULT_VIEW = "404";
	
	@GetMapping("/example4")
	public ModelAndView exampleMAV() {
		return new ModelAndView(RESULT_VIEW);
	}
	
//	@GetMapping("exampleString")
	//	public ModelAndView exampleMAV() {
	//		return new ModelAndView(EXAMPLE_VIEW);
	//	}

}
