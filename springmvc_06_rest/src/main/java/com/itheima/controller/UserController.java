package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    //現在のリクエストメソッドをPOSTに設定し、RESTスタイルの追加操作を示す
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    @ResponseBody
    public String save(){
        System.out.println("user save...");
        return "{'module':'user save'}";
    }

    //現在のリクエストメソッドをDELETEに設定し、RESTスタイルの削除操作を示す
    //@PathVariableアノテーションは、パス変数（パスパラメータ）を設定するために使用されます。
    //対応するプレースホルダーがパス上に設定されており、かつプレースホルダーの名前がメソッドの引数名と同じである必要がある
    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id){
        System.out.println("user delete..." + id);
        return "{'module':'user delete'}";
    }

    //设置当前请求方法为PUT，表示REST风格中的修改操作
    @RequestMapping(value = "/users",method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user){
        System.out.println("user update..."+user);
        return "{'module':'user update'}";
    }

    //現在のリクエストメソッドをPUTに設定し、RESTスタイルの変更操作を示す
    //@PathVariableアノテーションは、パス変数（パスパラメータ）を設定するために使用されます。
    //対応するプレースホルダーがパス上に設定されており、かつプレースホルダーの名前がメソッドの引数名と同じである必要がある
    @RequestMapping(value = "/users/{id}" ,method = RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable Integer id){
        System.out.println("user getById..."+id);
        return "{'module':'user getById'}";
    }

    //現在のリクエストメソッドをGETに設定し、RESTスタイルのクエリ操作を示す
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    @ResponseBody
    public String getAll(){
        System.out.println("user getAll...");
        return "{'module':'user getAll'}";
    }

}

