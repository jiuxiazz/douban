package fm.douban.app.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainControl {

    @GetMapping("index.html")
    public String index(Model model){
        return "index";
    }
}
