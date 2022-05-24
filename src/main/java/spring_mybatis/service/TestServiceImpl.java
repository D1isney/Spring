package spring_mybatis.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring_mybatis.bean.Student_mybatis;
import spring_mybatis.mapper.TestMapper;

@Component
public class TestServiceImpl implements TestService{

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;


    @Override
    public Student_mybatis getStudent() {
        TestMapper testMapper = sqlSessionTemplate.getMapper(TestMapper.class);
        return testMapper.getStudent_mybatis();
    }
}
