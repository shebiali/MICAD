package ae.gov.micad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

/**
 * @author ShahbazAli
 *
 */
@Controller
public class HomeController {

    @ModelAttribute("page")
    public String module() {
        return "home";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Principal principal) {
    	 return "home/home";
    }
  
    
}
