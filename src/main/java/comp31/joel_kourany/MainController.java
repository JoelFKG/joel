package comp31.joel_kourany;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String getRoot() {
        return "login";
    }
    
    @GetMapping("/login")
    public String getLogin(@RequestParam String userId, Model model) {
        model.addAttribute("userId", userId);
        return "home";
    }    

    @GetMapping("/image")
    public String image(Model model) {
        model.addAttribute("name", "lol");
        return "imagePage";
    }

}
