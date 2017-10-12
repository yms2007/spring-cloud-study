package com.inspur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yangmingsheng on 2017/10/12.
 */
@SpringBootApplication
public class ConsumerMovieApplication {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(ConsumerMovieApplication.class, args);
    }
}
