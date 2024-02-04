package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// Step 4: create a controller class

@Controller // to make this java file as a controller class we use this annotation also to activate  this annotation you have to add component scan tag in spring configuration file
public class HomeController {
	
	@RequestMapping("/home") // you have to specify the url at which this method should work
	public String home() {
		System.out.println("This is home url");
		
		return "index"; // return the view page name. remaining prefix and suffix will be added by the viewResolver which is configured in spring configuration file.
	}
	
	@RequestMapping("/about")
	public String about() {
		
		System.out.println("about page url");
		return"about";
	}

}
