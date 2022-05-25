package spring_mybatis.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import spring_mybatis.bean.Student_mybatis;
import spring_mybatis.mapper.TestMapper;

import javax.annotation.Resource;

@Component
public class TestServiceImpl implements TestService{

    @Resource
    TestMapper mapper;

    @Override
    public Student_mybatis getStudent() {
        return mapper.getStudent_mybatis();
    }

    //作为一个事务来执行
    @Transactional
    @Override
    public void test() {
//        DataSourceTransactionManager manager;
//        try{
//            mapper.insertStudent();
//            mapper.insertStudent();
//            manager.commit();
//        }catch (Exception e){
//            //出现异常回滚
//            manager.rollback();
//        }

        mapper.insertStudent();
        if(true) throw new RuntimeException("我是异常！");
        mapper.insertStudent();
    }
}
