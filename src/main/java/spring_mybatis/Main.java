package spring_mybatis;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_annotation.config.MainConfiguration;
import spring_mybatis.config.MainConfiguration_mybatis;
import spring_mybatis.mapper.TestMapper;
import spring_mybatis.service.TestService;
import spring_mybatis.service.TestServiceImpl;

@Slf4j
public class Main {
    public static void main(String[] args) {

        log.info("服务器正在启动！");

        //IOC容器
        ApplicationContext context1 = new AnnotationConfigApplicationContext(MainConfiguration_mybatis.class);
//        SqlSessionTemplate template = context1.getBean(SqlSessionTemplate.class);
//        TestMapper testMapper = template.getMapper(TestMapper.class);
//        System.out.println(testMapper.getStudent_mybatis());
        TestService service = context1.getBean(TestService.class);
        service.test();
        System.out.println(service.getStudent());
        log.info("程序结束！");
    }
}
