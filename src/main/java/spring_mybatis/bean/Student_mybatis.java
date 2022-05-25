package spring_mybatis.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class Student_mybatis {
    int sid;
    String name;
    String sex;
}
