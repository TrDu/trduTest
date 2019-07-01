package com.trdu.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: tanyong
 * @Description:
 * @Date: 2019/6/28 17:39
 * @Modified By:
 */
@Controller
@RequestMapping("/main")
public class TestController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
