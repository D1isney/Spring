package spring_mybatis.mapper;

import org.apache.ibatis.annotations.Select;
import spring_mybatis.bean.Student_mybatis;

public interface TestMapper {
    @Select("select * from student where sid ='1'")
    Student_mybatis getStudent_mybatis();
}
