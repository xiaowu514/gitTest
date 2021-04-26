package com.xw.test.testmybatisplus.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Component
@RequestMapping("/test")
public class Test01 {

//    @Autowired
//    private RestTemplate restTemplate;
//
//    @RequestMapping("/restTemplate")
//    public String getRestTemplate () {
//        String forEntity = restTemplate.getForObject("http://api.lkblog.net/ws/api.php", String.class);
//
//        return forEntity;
//    }

    public static void main(String[] args) {

        int i = 0/0;

        System.err.println(i);
    }

}
