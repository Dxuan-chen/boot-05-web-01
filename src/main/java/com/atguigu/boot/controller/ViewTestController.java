package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 功能描述：
 *
 * @author 陈铉锋
 * @date 2021/8/10
 */
@Controller
public class ViewTestController {

    @GetMapping("/atguigu")
    public String atguigu(Model model) {
        model.addAttribute("msg","你好 HelloWorld");
        model.addAttribute("link","www.baidu.com");

        return "success";
    }
}
