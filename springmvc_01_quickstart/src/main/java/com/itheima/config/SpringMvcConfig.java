package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: SpringMvcConfig
 * Package: com.itheima.config
 * Description:
 *
 * @Author: tge
 * @Create: 2023/11/6 - 16:57
 * Version:
 */

//Spring MVCの設定ファイルを作成し、対応するControllerのBeanを読み込む
@Configuration
@ComponentScan("com.itheima.controller")
public class SpringMvcConfig {

}
