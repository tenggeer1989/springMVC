package com.itheima.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: UserController
 * Package: com.itheima.controller
 * Description:
 *
 * @Author: tge
 * @Create: 2023/11/6 - 16:41
 * Version:
 */

//Controllerを定義する
//@Controllerを使用してbeanを定義する
@ Controller
public class UserController {
    //現在の操作のアクセス パスを設定する
    @RequestMapping("/save")
    //現在の操作の戻り値の型を設定する
    @ResponseBody
    public String save(){
        System.out.println("user save....");
        return "{'module':'springmvc'}";
    }
}
