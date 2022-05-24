package spring_mybatis.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.*;

import java.io.IOException;
import java.util.Date;

@EnableAspectJAutoProxy
@ComponentScans({
        @ComponentScan("spring_mybatis.bean"),
        @ComponentScan("spring_mybatis.service")
})
@Configuration
@Import(Date.class)
public class MainConfiguration {

    @Bean
    public SqlSessionTemplate sqlSessionTemplate() throws IOException {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(
                new SqlSessionFactoryBuilder()
                 .build(Resources.getResourceAsReader("beans_mybatis.xml")));
        return sqlSessionTemplate;
    }
}
