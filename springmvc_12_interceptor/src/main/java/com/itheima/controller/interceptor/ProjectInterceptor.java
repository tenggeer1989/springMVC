package com.itheima.controller.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
//インターセプタークラスを定義し、HandlerInterceptorインターフェースを実装する
//現在のクラスはSpringコンテナによって制御される必要がある
public class ProjectInterceptor implements HandlerInterceptor {
    @Override
    //原始のメソッド呼び出し前に実行される内容
    //戻り値の型は制御をインターセプトできます。trueなら実行を許可し、falseなら中止します
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String contentType = request.getHeader("Content-Type");
        HandlerMethod hm = (HandlerMethod)handler;
        System.out.println("preHandle..."+contentType);
        return true;
    }

    @Override
    //原始のメソッド呼び出し前に実行される内容
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle...");
    }

    @Override
    //原始のメソッド呼び出し前に実行される内容
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion...");
    }
}
