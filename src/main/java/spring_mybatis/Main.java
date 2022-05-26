package spring_mybatis;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_annotation.config.MainConfiguration;
import spring_mybatis.mapper.TestMapper;
import spring_mybatis.service.TestService;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context1 = new AnnotationConfigApplicationContext(MainConfiguration.class);
//        SqlSessionTemplate template = context1.getBean(SqlSessionTemplate.class);
//        TestMapper testMapper = template.getMapper(TestMapper.class);
//        System.out.println(testMapper.getStudent_mybatis());
        TestService service = context1.getBean(TestService.class);
        System.out.println(service.getStudent());

    }
}
