package com.jianan.demomodule.test.service;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: jn
 * @Date: 2024/6/11
 * @description
 **/
@Service
public class DefaultService {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    
    public void insert(){
        
    }
}
