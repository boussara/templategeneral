package net.crunchdroid;

import java.util.LinkedHashMap;
import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author CrunchDroid
 */
@Controller
public class PageController {

    @RequestMapping(value = "/home", method=RequestMethod.GET)
    public String chart(Model model) {
         
        //first, add the regional sales
        Integer northeastSales = 17089;
        Integer westSales = 10603;
        Integer midwestSales = 5223;
        Integer southSales = 10111;
         
        model.addAttribute("northeastSales", northeastSales);
        model.addAttribute("southSales", southSales);
        model.addAttribute("midwestSales", midwestSales);
        model.addAttribute("westSales", westSales);
         
        //now add sales by lure type
        List<Integer> inshoreSales = Arrays.asList(4074, 3455, 4112);
        List<Integer> nearshoreSales = Arrays.asList(3222, 3011, 3788);
        List<Integer> offshoreSales = Arrays.asList(7811, 7098, 6455);
         
        model.addAttribute("inshoreSales", inshoreSales);
        model.addAttribute("nearshoreSales", nearshoreSales);
        model.addAttribute("offshoreSales", offshoreSales);
         
        return "home";
    }
     

    @GetMapping("/")
    public String login() {
        return "login";
    }

 

    @GetMapping("/plain-page")
    public String plainPage() {
        return "plain-page";
    }

    @GetMapping("/pricing-tables")
    public String pricingTables() {
        return "pricing-tables";
    }

}
