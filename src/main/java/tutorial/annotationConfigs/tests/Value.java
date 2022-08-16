package tutorial.annotationConfigs.tests;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tutorial.annotationConfigs.value.BeanA;

@ComponentScan("tutorial/annotationConfigs/value")
@PropertySource("classpath:tutorial/annotationConfig/values.properties")
public class Value {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(Value.class);

        BeanA o =(BeanA) context.getBean("beanA");

        System.out.println("intValue="+o.getIntValue());
        System.out.println("stringValue="+o.getStringValue());
        System.out.println("beanBStringValue="+o.getBeanBStringValue());
    }
}
