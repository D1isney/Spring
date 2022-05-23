package spring_annotation.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import spring_annotation.bean.Card;
import spring_annotation.bean.annotation_student;

//组件扫描
//@ComponentScan("spring_annotation.bean")
//@Configuration

//配置类 ————》当作xml
@Configuration

public class MainConfiguration {

    //声明一个bean
    //改名@Bean("123") --->  123
    @Bean
    //原形模式
    @Scope("prototype")
    public Card card(){
        return new Card();
    }
//
//    @Bean
//    public annotation_student annotation_student(@Autowired Card card){
//        annotation_student annotation_student = new annotation_student();
//
//        //参数的形式注入
//        annotation_student.setCard(card);
//
////        annotation_student.setName("小明");
//        return annotation_student;
//    }

    @Bean
    public annotation_student annotation_student(){
        return new annotation_student();
    }

}
