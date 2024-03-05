package com.jianan.demomodule.test.lock;

/**
 * @Author:
 * @Date: 2024/3/5
 * @description
 **/
public class Main {
    public static void main(String[] args) {
        BusinessService businessService = new BusinessService();
        new Thread(()-> businessService.approve("1")).start();
        new Thread(()-> businessService.approve("2")).start();
    }
}
