package spring_mybatis;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_mybatis.config.MainConfiguration;
import spring_mybatis.mapper.TestMapper;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
        SqlSessionTemplate sqlSessionTemplate = context.getBean(SqlSessionTemplate.class);
        TestMapper testMapper = sqlSessionTemplate.getMapper(TestMapper.class);
        System.out.println(testMapper.getStudent_mybatis());
    }
}
