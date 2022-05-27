package spring_mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring_mybatis.bean.Student_mybatis;

import javax.annotation.Resource;

public interface TestService {
    Student_mybatis getStudent();
    void test();
    void test2();
}
