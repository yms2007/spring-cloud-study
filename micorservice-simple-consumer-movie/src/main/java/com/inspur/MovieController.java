package com.inspur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yangmingsheng on 2017/10/12.
 */
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("user/{id}")
    public UserExt findById(@PathVariable int id) {
        UserExt user = restTemplate.getForObject("http://127.0.0.1:8000/"+id,UserExt.class);
        return user;
    }
}
