package spring_mybatis.bean;

import lombok.Data;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Student_mybatis {
    int sid;
    String name;
    String sex;

}
