
package com.jianan.demomodule.test.json;

import com.alibaba.fastjson.JSON;

/**
 * Main
 * @description
 * @author lijianan
 * @date 2024/3/18 15:20
 * @version TODO
 */
public class Main {
    public static void main(String[] args)
    {
        Param param = new Param();
        param.setName(null);
        System.out.println(JSON.toJSONString(param));
    }
}