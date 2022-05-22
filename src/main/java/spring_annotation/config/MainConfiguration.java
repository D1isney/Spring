package spring_annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import spring_annotation.bean.Card;

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

}
