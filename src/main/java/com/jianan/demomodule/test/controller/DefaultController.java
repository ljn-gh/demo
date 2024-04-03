package com.jianan.demomodule.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import java.text.NumberFormat;

/**
 * DefaultController
 * @description
 * @author lijianan
 * @date 2024/3/25 14:06
 * @version TODO
 */
@RequestMapping
@RestController
public class DefaultController {
    @PostMapping("index")
    public void index(HttpServletRequest request) {
        String requestURI = request.getRequestURI();
    }

    @GetMapping("get")
    public void get(HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        request.getQueryString();
    }

    public static void main(String[] args) {
        double a = 0.0000221;
        NumberFormat nf = NumberFormat.getPercentInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(0);
        System.out.println(nf.format(a));
        System.out.println(Double.MAX_VALUE);
    }
}