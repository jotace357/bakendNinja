package udemy.controller;
import org.springframework.*;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import udemy.model.Person;

@Controller
@RequestMapping("/example")

public class ExampleController {
	
	public static final String EXAMPLE_VIEW = "example";

	//primera forma
	//@RequestMapping(value="/exampleString", method=RequestMethod.GET)
	@GetMapping("/exampleString")
	public String exampleString(Model model) {
		model.addAttribute("people", getPeople());
		return EXAMPLE_VIEW;
	}
	
	// segunda forma
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {
		ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
		mav.addObject("people", getPeople());
		return mav;
	}
	
	private List<Person> getPeople(){
		List<Person> people = new ArrayList<>();
		people.add(new Person("JUlio",46));
		people.add(new Person("Jorge",48));
		people.add(new Person("Pedro",76));
		people.add(new Person("Jose",64));
		people.add(new Person("Andres",16));
		people.add(new Person("Maria",46));
		people.add(new Person("Mariana",9));
		return people;
	}
	
	//primera forma
		//@RequestMapping(value="/exampleString", method=RequestMethod.GET)
	//	@GetMapping("exampleMAV")
	//	public String exampleString() {
	//		return EXAMPLE_VIEW;
	//	}
		
		// segunda forma
	//	@GetMapping("exampleString")
	//	public ModelAndView exampleMAV() {
	//		return new ModelAndView(EXAMPLE_VIEW);
	//	}
	
}
