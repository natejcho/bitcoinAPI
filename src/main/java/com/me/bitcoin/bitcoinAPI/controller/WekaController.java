package com.me.bitcoin.bitcoinAPI.controller;

import com.me.bitcoin.bitcoinAPI.service.LinearRegressionService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weka")
@Slf4j
public class WekaController {

    LinearRegressionService lrs = new LinearRegressionService();

    @RequestMapping("/evaluate")
    public String evaluate() throws Exception {
        log.debug("we'll see you soon");
        return lrs.getEval();
    }
	
}
