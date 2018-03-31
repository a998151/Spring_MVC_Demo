package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by ALemon on 2017/11/29.
 */
@Controller             //声明为一个控制器
public class HomeController {
    @RequestMapping(value = "/home",method = GET)
    public String home(ModelMap modelMap){

        //通过model传递所需要的数据给页面
        modelMap.addAttribute("name","Alemon");

        //返回需要渲染的页面
        return "home";
    }
}
