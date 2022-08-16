package tutorial.lifeCycles.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Test {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(Test.class);
        BeanA beanA = (BeanA) context.getBean("beanA");

        //BeanA ApplicationContextAware olduğu için contextler aynı referansı göstermeli
        System.out.println("context==beanA.getApplicationContext() ==> "+(context==beanA.getApplicationContext()));

        System.out.println("\n beanA name ==> "+beanA.getName());
    }
}
