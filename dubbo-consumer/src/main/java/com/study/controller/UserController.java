package com.study.controller;

import com.study.model.User;
import com.study.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/userDetail")
    public String userDetail(Model model,Integer id){
        User user1 = userService.queryById(id);
        model.addAttribute("user1",user1);
        return "userDetail";
    }
}
