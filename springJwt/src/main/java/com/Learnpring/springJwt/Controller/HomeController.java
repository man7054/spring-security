package com.Learnpring.springJwt.Controller;

import com.Learnpring.springJwt.entity.User;
import com.Learnpring.springJwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public List<User> say(){
        return userService.getUser();
    }
    @GetMapping("/current_user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }

}
