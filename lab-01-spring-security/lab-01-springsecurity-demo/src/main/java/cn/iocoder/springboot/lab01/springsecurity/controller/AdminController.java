package cn.iocoder.springboot.lab01.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    // 有拦截器，需要登录
    @GetMapping("/demo")
    public String demo() {
        return "示例返回";
    }

}
