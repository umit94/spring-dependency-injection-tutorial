package tutorial.xmlConfigs.tests;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowire {
    public static void main(String[] args) {
        

        ApplicationContext context=new ClassPathXmlApplicationContext("tutorial\\autowire.xml");

        Object o = context.getBean("beanA");
        System.out.println(o);
    }
}
