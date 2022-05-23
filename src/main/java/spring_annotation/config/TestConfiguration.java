package spring_annotation.config;

import org.springframework.context.annotation.Bean;
import spring_annotation.bean.Teacher;

public class TestConfiguration {

    @Bean
    public Teacher teacher(){
        return new Teacher();
    }
}
