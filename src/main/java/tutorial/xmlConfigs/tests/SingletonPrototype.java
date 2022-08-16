package tutorial.xmlConfigs.tests;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonPrototype {
    public static void main(String[] args) {
        
        System.out.println("\nSingleton constructor calls start");
        ApplicationContext context = new ClassPathXmlApplicationContext("tutorial\\singleton-prototype.xml");
        System.out.println("Singleton constructor calls end");

        System.out.println("\nPrototype constructor calls start");
        Object o = context.getBean("prototypeBean");
        System.out.println("Prototype constructor calls end");
    }
}
