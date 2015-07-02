package ae.gov.micad.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ShahbazAli
 *
 */
@Controller
public class ContactController {
   
	 @ModelAttribute("page")
	    public String module() {
	        return "contact";
	    }

	 @RequestMapping(value = "contact", method = RequestMethod.GET)
	    public String index(Principal principal) {
	    	 return "contact/contact";
	    }
	 
}
