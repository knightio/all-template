package cc.becurious.web.controller;

import cc.becurious.system.domain.User;
import cc.becurious.system.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;


    @GetMapping("/{userId}")
    public User getUser( @PathVariable("userId") Long userId) {

        return userService.selectUserById(userId);
    }

}
