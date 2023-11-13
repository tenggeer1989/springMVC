package com.itheima.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * ClassName: ServletContainersInitConfig
 * Package: com.itheima.config
 * Description:
 *
 * @Author: tge
 * @Create: 2023/11/6 - 16:59
 * Version:
 */
//Servletコンテナの起動構成クラスを定義し、その中でSpringの構成を読み込む
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {

    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
