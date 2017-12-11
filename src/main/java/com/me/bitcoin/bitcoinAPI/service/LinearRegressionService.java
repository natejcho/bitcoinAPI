package com.me.bitcoin.bitcoinAPI.service;

import com.me.bitcoin.bitcoinAPI.dataModels.LinearRegressionModel;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

//@Service
@Slf4j
@Data
public class LinearRegressionService {

    public static LinearRegressionModel lrm;
    
    public String getEval() throws Exception {
        log.debug("i'll get that for you");
        return lrm.crossValidation();
    }
	
}