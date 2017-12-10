package com.me.bitcoin.bitcoinAPI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloWorldController {

    @RequestMapping("/hello")
    public String greet() {
        log.debug("i'm hit captain");
        return "Hello, World!";
    }
	
}
