package spring_mybatis;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_mybatis.config.MainConfiguration;
import spring_mybatis.mapper.TestMapper;
import spring_mybatis.service.TestService;

@Slf4j
public class Main {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
//        SqlSessionTemplate sqlSessionTemplate = context.getBean(SqlSessionTemplate.class);
//        TestMapper testMapper = sqlSessionTemplate.getMapper(TestMapper.class);
//        System.out.println(testMapper.getStudent_mybatis());

      log.info("服务器正在启动");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        TestService service = context.getBean(TestService.class);
        System.out.println(service.getStudent());

    }
}
