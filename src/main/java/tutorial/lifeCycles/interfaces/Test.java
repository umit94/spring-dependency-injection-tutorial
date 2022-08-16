package tutorial.lifeCycles.interfaces;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BeanA.class);
        BeanA beanA = (BeanA) context.getBean("beanA");
        context.close();
        beanA.isRunning();
    }
}
