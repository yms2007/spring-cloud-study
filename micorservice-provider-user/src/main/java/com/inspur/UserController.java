package com.inspur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangmingsheng on 2017/10/12.
 */
@RestController
public class UserController {
    @GetMapping("/{id}")
    public User findById(@PathVariable int id) {
        User user = new User();
        user.setId(id);
        user.setName("tomcat");
        user.setAge(18);
        return user;
    }
}
