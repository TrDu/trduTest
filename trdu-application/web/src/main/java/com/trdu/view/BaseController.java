package com.trdu.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: tanyong
 * @Description:
 * @Date: 2019/10/20
 * @Modified By:
 */
@Controller
@RequestMapping("/")
public class BaseController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "system/login";
    }
}
