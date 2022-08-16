package tutorial.xmlConfigs.tests;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lazy {
    public static void main(String[] args) {
        

        //lazy-init true olanların constructor çağırıları getBean methodu ile yapılır
        System.out.println("\nEager inits' constructor calls start");
        ApplicationContext context = new ClassPathXmlApplicationContext("tutorial\\lazy.xml");
        System.out.println("Eager inits' constructor calls end");

        System.out.println("Lazy inits' constructor calls start");
        Object o = context.getBean("lazyBeanA"); //lazy-init true olanların constructor çağırıları getBean methodu ile yapılır
        o = context.getBean("lazyBeanB");
        System.out.println("Lazy inits' constructor calls end");
    }
}
