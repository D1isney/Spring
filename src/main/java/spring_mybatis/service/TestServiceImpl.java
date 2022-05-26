package spring_mybatis.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import spring_mybatis.bean.Student_mybatis;
import spring_mybatis.mapper.TestMapper;

import javax.annotation.Resource;

@Component
public class TestServiceImpl implements TestService{

    @Resource
    SqlSessionTemplate template;

    @Override
    public Student_mybatis getStudent() {
        TestMapper testMapper = template.getMapper(TestMapper.class);
        return testMapper.getStudent_mybatis();
    }
}
