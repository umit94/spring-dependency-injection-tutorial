package tutorial.xmlConfigs.tests;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Factory {
    public static void main(String[] args) {
        

        ApplicationContext context = new ClassPathXmlApplicationContext("tutorial\\factory-constructorinjection.xml");
    }
}
