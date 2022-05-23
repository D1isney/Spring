package spring_annotation.bean;

import lombok.ToString;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jmx.export.annotation.ManagedResource;

@ToString
//@ComponentScan
public class annotation_student {
    int age;
    String name;

    Card card;

    public void setName(String name) {
        this.name = name;
    }
    public void setCard(Card card) {
        this.card = card;
    }

    public void init(){
        System.out.println("属性Card为："+card);
    }

    public String say(String text){
        System.out.println("我叫"+name+"今年"+age+"岁了");
        return text;
    }

}
