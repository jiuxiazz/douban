package fm.douban.app.control;

import fm.douban.app.pojo.Singer;
import fm.douban.app.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SingerTestControl {

    @Autowired
    private SingerService singerService;

    @GetMapping("test/singer/add")
    public Singer testAddSinger(Singer singer){
        if (singer != null){
            singerService.addSinger(singer);
        }
        return singer;
    }


}
