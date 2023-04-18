package th.co.opentechlab.spring.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class AppController {

    @GetMapping("/")
    public String index(HttpServletRequest httpServletRequest, Model model){
        model.addAttribute("name", "mao");
        return "index";
    }
}
