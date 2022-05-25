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


@EnableTransactionManagement
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

//    //创建一个数据源的实现类
//    @Bean
//    public DataSource dataSource(){
//        PooledDataSource dataSource = new PooledDataSource();
//        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
//        dataSource.setDriver("com.mysql.cj.jdbc.Driver");
//        dataSource.setUsername("root");
//        dataSource.setPassword("Fengxi1217.00");
//        return dataSource;
//    }

    //事物管理器
    @Bean
    public TransactionManager transactionManager(){
        return new DataSourceTransactionManager();
    }

    //创建一个数据源（这个会比较快）
        public DataSource dataSource(){
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/study");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
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
