package edu.isep.speakisep;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class AdminUniversitiesController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminUniversitiesController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/admin_universities", method = RequestMethod.GET)
	public String home() {
		return "admin_universities";
	}
	
	
}
