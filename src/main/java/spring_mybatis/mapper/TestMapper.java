package spring_mybatis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import spring_mybatis.bean.Student_mybatis;

@Mapper
public interface TestMapper {
    @Select("select * from student where sid ='1'")
    Student_mybatis getStudent_mybatis();

    @Insert("insert into student(name,sex) value('测试','男')")
    void insertStudent_mybatis();
}
