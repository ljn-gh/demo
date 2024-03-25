package com.jianan.demomodule.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

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
}