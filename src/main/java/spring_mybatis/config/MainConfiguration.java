package spring_mybatis.config;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Date;

@EnableAspectJAutoProxy
@ComponentScans({
        @ComponentScan("spring_mybatis.bean"),
        @ComponentScan("spring_mybatis.service")
})
@Configuration
@MapperScan("spring_mybatis.mapper")
public class MainConfiguration {

//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate() throws IOException {
//        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(
//                new SqlSessionFactoryBuilder()
//                 .build(Resources.getResourceAsReader("beans_mybatis.xml")));
//        return sqlSessionTemplate;
//    }

    //创建一个数据源的实现类
    @Bean
    public DataSource dataSource(){
        PooledDataSource dataSource = new PooledDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setDriver("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("Fengxi1217.00");
        return dataSource;
    }

    public SqlSessionFactoryBean sqlSessionFactoryBean(@Autowired DataSource source){
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(source);
        return bean;
    }




}
