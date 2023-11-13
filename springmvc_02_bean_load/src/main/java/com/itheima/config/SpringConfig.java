package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
//@ComponentScan({"com.itheima.service","com.itheima.dao"})
//Springの設定クラスでBeanをロードする際のフィルタリングルールを設定し、ビューレイヤーに対応するBeanを除外する必要があります
//excludeFilters属性: Beanのスキャンとロード時に除外するフィルタリングルール
//type属性：Beanの定義時のアノテーションタイプに基づいて除外します
//classes属性：@Controllerで定義されたBeanを除外します
@ComponentScan(value="com.itheima",
    excludeFilters = @ComponentScan.Filter(
        type = FilterType.ANNOTATION,
        classes = Controller.class
    )
)
public class SpringConfig {
}
