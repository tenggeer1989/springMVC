package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    //応答ページ/転送ページ
    //戻り値はString型であり、戻り値をページ名に設定することで、ページの移動が実現できる
    @RequestMapping("/toJumpPage")
    public String toJumpPage(){
        System.out.println("跳转页面");
        return "page.jsp";
    }

    //応答テキストデータ
    //戻り値はString型であり、任意の文字列情報を返すために、
    //指定された文字列情報を返すように設定する必要があります。これには@ResponseBodyアノテーションが必要
    @RequestMapping("/toText")
    @ResponseBody
    public String toText(){
        System.out.println("返回纯文本数据");
        return "response text";
    }

    //POJOオブジェクトに応答する
    //戻り値はエンティティクラスのオブジェクトであり、戻り値をエンティティクラスの型に設定することで、
    //対応するオブジェクトのJSONデータを返すことができます。
    //これには@ResponseBodyアノテーションと@EnableWebMvcアノテーションが必要
    @RequestMapping("/toJsonPOJO")
    @ResponseBody
    public User toJsonPOJO(){
        System.out.println("返回json对象数据");
        User user = new User();
        user.setName("itcast");
        user.setAge(15);
        return user;
    }

    //POJOコレクションオブジェクトに応答する
    //戻り値はコレクションオブジェクトです。戻り値をコレクションタイプに設定することで、
    //対応するコレクションのJSON配列データを返すことができます。
    //@ResponseBodyアノテーションと@EnableWebMvcアノテーションに依存
    @RequestMapping("/toJsonList")
    @ResponseBody
    public List<User> toJsonList(){
        System.out.println("返回json集合数据");
        User user1 = new User();
        user1.setName("传智播客");
        user1.setAge(15);

        User user2 = new User();
        user2.setName("黑马程序员");
        user2.setAge(12);

        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);

        return userList;
    }
}
