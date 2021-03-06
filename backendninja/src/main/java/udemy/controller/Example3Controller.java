package udemy.controller;

//import javax.validation.Valid;

import org.apache.commons.logging.LogFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import org.slf4j.Logger;

import udemy.model.Person;

@Controller
@RequestMapping("/example3")
public class Example3Controller {
	
	private static Logger LOG = LoggerFactory.getLogger(Example3Controller.class); 
	
	public static final String FORM_VIEW = "form";
	public static final String RESULT_VIEW = "result";
	
	//#1
	/*@GetMapping("/")
	public String redirect() {
		return "redirect:/example3/showform";
	}
	*/
	@GetMapping("/")
	public RedirectView redirect() {
		return new RedirectView("/example3/showform");
	}
	
	
	@GetMapping("/showform")
	public String showForm(Model model) {
		//LOG.info("INFO TRACE");
		//LOG.warn("WARNING TRACE");
		//LOG.error("ERROR TRACE");
		//LOG.debug("");
		model.addAttribute("person", new Person());
		
		return FORM_VIEW;
	}
	
	@PostMapping("/addperson")
	//public ModelAndView addPerson(@Valid @ModelAttribute("person") Person person, BindingResult bindingResult) {
	public ModelAndView addPerson(@ModelAttribute("person") Person person) {
		LOG.info("METHOD: 'addPerson' -- PARAMS: '" + person + "'");
		ModelAndView mav = new ModelAndView(RESULT_VIEW);
		return mav;
	}

}
