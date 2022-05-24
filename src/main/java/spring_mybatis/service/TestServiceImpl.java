package spring_mybatis.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
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
}
