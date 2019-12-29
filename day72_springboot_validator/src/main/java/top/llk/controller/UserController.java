package top.llk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import top.llk.pojo.User;

import javax.validation.Valid;

/**
 * @Version 1.0
 * @Author: Lin Liangkun
 * @Date: 2019/12/28
 * @Content:
 */
@Controller
public class UserController {

    @RequestMapping("/add")
    public @ResponseBody
    String save(@Valid User user) {
        System.out.println(user);
        //回传json格式
        return "success";
    }

    /**
     * 页面跳转用这种方法
     * @return
     */
    @RequestMapping("hello")
    public ModelAndView sayHello() {
        System.out.println("访问hello方法");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");
        return modelAndView;
    }


}
