package tutorial.annotationConfigs.tests;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tutorial.annotationConfigs.qualifiers.BeanA;


public class Qualifier {
    public static void main(String[] args) {
        

        ApplicationContext context=new ClassPathXmlApplicationContext("tutorial\\annotationConfig\\config.xml");

        Object o = context.getBean("beanA");

        System.out.println((BeanA) o);
    }
}
