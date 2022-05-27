package spring_mybatis.config;


import com.zaxxer.hikari.HikariDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;

//@EnableAspectJAutoProxy
@EnableTransactionManagement
@ComponentScan("spring_mybatis.service")
@Configuration
//@Import(Data.class)
//自动扫描这个包下面的  接口
@MapperScan("spring_mybatis.mapper")
public class MainConfiguration_mybatis {
    //基于数据源的事务管理器
    @Bean
    public TransactionManager transactionManager(@Autowired DataSource source){
        return  new DataSourceTransactionManager(source);
    }



//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate() throws IOException {
//        return new SqlSessionTemplate(new SqlSessionFactoryBuilder()
//                .build(Resources.getResourceAsReader("beans_mybatis.xml")));
//    }

    //SqlSessionTemplateBean

    //数据源信息
    @Bean
    public DataSource dataSource() throws SQLException {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/study");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("Fengxi1217.00");
        return dataSource;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(@Autowired DataSource source){
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(source);
        return bean;
    }

}
