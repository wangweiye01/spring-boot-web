package cc.wangweiye.springbootweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(ModelMap model) {
        model.addAttribute("message", "Hello World!");
        return "index";
    }

    @RequestMapping("/page1")
    public String page1(ModelMap model) {
        return "page1";
    }
}
