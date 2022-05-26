package spring_mybatis.config;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.*;

import javax.xml.crypto.Data;
import java.io.IOException;

@EnableAspectJAutoProxy
@ComponentScan("spring_mybatis.service")
@Configuration
@Import(Data.class)
public class MainConfiguration {

    @Bean
    public SqlSessionTemplate sqlSessionTemplate() throws IOException {
        return new SqlSessionTemplate(new SqlSessionFactoryBuilder()
                .build(Resources.getResourceAsReader("beans_mybatis.xml")));
    }

}
