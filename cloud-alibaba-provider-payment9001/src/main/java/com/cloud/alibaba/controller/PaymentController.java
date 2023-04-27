package com.cloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kangkang
 * @create 2021/11/5 16:16
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @GetMapping("get/{id}")
    public String getPayment(@PathVariable("id") Integer id){

        return "nacos registry, \t serverport" + port+"\t id" +id ;
    }
}
