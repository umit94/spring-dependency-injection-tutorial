package tutorial.lifeCycles.predestroyPostConstruct;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Test.class);
        context.getBean("beanC"); //beanC prototype. prototypeların preDestroy methodları çağırılmaz
        System.out.println();

        context.registerShutdownHook(); //Uygulama sona erdiğinde preDestroy methodlarını çağırır, context.close() methodunu çağırmamıza gerek kalmaz
        //context.close();
    }
}
