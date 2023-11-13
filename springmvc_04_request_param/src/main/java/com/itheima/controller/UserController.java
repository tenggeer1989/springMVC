package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
//请求参数
@Controller
public class UserController {

    //通常のパラメーター：リクエストパラメーターと仮引数名を対応させることで、パラメーターの受け渡しが完了する
    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name ,int age){
        System.out.println("普通参数传递 name ==> "+name);
        System.out.println("普通参数传递 age ==> "+age);
        return "{'module':'common param'}";
    }

    //通常のパラメーター：リクエストパラメーターと仮引数名が異なる場合、@RequestParamアノテーションを使用して、
    //リクエストパラメータ名と仮引数名の関係を関連付けます
    @RequestMapping("/commonParamDifferentName")
    @ResponseBody
    public String commonParamDifferentName(@RequestParam("name") String userName , int age){
        System.out.println("普通参数传递 userName ==> "+userName);
        System.out.println("普通参数传递 age ==> "+age);
        return "{'module':'common param different name'}";
    }

    //POJOパラメータ：リクエストパラメータと形式パラメータオブジェクトのプロパティに対応させることで、パラメータの受け渡しが完了
    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user){
        System.out.println("pojo参数传递 user ==> "+user);
        return "{'module':'pojo param'}";
    }

    //ネストされたPOJOパラメータ：ネストされたプロパティは階層構造に従って名前を設定することで、パラメータの受け渡しを完了
    @RequestMapping("/pojoContainPojoParam")
    @ResponseBody
    public String pojoContainPojoParam(User user){
        System.out.println("pojo嵌套pojo参数传递 user ==> "+user);
        return "{'module':'pojo contain pojo param'}";
    }

    //配列パラメーター：同じ名前のリクエストパラメーターは、対応する名前の形式パラメータ配列オブジェクトに直接マッピングできる
    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] likes){
        System.out.println("数组参数传递 likes ==> "+ Arrays.toString(likes));
        return "{'module':'array param'}";
    }

    //集合パラメーター：同じ名前のリクエストパラメータは、
    // @RequestParamアノテーションを使用して対応する名前のコレクションオブジェクトにマッピングされ、
    // データとして使用される
    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> likes){
        System.out.println("集合参数传递 likes ==> "+ likes);
        return "{'module':'list param'}";
    }



    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes){
        System.out.println("list common(json)参数传递 list ==> "+likes);
        return "{'module':'list common for json param'}";
    }


    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user){
        System.out.println("pojo(json)参数传递 user ==> "+user);
        return "{'module':'pojo for json param'}";
    }


    @RequestMapping("/listPojoParamForJson")
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User> list){
        System.out.println("list pojo(json)参数传递 list ==> "+list);
        return "{'module':'list pojo for json param'}";
    }

    //日付パラメータ
    //@DateTimeFormatアノテーションを使用して、日付型データのフォーマットを設定します。デフォルトのフォーマットはyyyy/MM/dd
    @RequestMapping("/dataParam")
    @ResponseBody
    public String dataParam(Date date,
                            @DateTimeFormat(pattern="yyyy-MM-dd") Date date1,
                            @DateTimeFormat(pattern="yyyy/MM/dd HH:mm:ss") Date date2){
        System.out.println("参数传递 date ==> "+date);
        System.out.println("参数传递 date1(yyyy-MM-dd) ==> "+date1);
        System.out.println("参数传递 date2(yyyy/MM/dd HH:mm:ss) ==> "+date2);
        return "{'module':'data param'}";
    }

}











