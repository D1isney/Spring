package spring_mybatis.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import spring_mybatis.bean.Student_mybatis;
import spring_mybatis.mapper.TestMapper;

import javax.annotation.Resource;

@Transactional
@Service
public class TestServiceImpl implements TestService{

//    @Resource
//    SqlSessionTemplate template;
    @Resource
    TestMapper mapper;

    @Override
    public Student_mybatis getStudent() {
//        TestMapper testMapper = template.getMapper(TestMapper.class);
//        return testMapper.getStudent_mybatis();
        return mapper.getStudent_mybatis();
    }

    //一共七种

    //默认级别
    //PROPAGATION_REQUIRED
    //表示当前方法必须运行在事物中，如果当前事务存在，方法将会在该事务中运行，否则，会启动一个新的事务

    //PROPAGATION_SUPPORTS
    //表示当前方法不需要事务上下文，但是如果存在当前事务的话，那么方法会在这个事务中运行

    //PROPAGATION_MANDATORY
    //表示该方法必须在事务中运行，如果当前事务不存在，则会抛出一个异常

    @Transactional
    @Override
    public void test() {
//        mapper.insertStudent_mybatis();
        //事务出现异常的时候会出现一个回滚操作
//        if (true)throw new RuntimeException("我是异常！");
//        mapper.insertStudent_mybatis();

        //这样写不会影响到test2
//        test2();
//        throw new RuntimeException("事务1异常");

        test2();
    }


//    @Transactional(propagation = Propagation.SUPPORTS)
    //当发生异常时，虽然依然存在AOP增强。，但是不会进行回滚操作
    //但是需要嵌套在另一个事务中

    @Transactional(propagation = Propagation.MANDATORY)
    //表示此方法不应该加入到任何事务中，其余类型用于同时操作多数据源情况下的分布式事务管理

    @Override
    public void test2() {
        //如果出现异常
        //那么事务就会回滚
        //包括调用这个方法的事务
        mapper.insertStudent_mybatis();
//        throw  new RuntimeException("事务2异常");
    }
}
