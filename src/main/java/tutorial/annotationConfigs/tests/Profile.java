package tutorial.annotationConfigs.tests;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.AbstractEnvironment;
import tutorial.annotationConfigs.qualifiers.BeanA;



public class Profile {
    public static void main(String[] args) {
        


        //-Dspring.profiles.active=profileA //JVM'e geçilerek profile belirlenebilir
        System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME,"profileB");

        ApplicationContext context=new ClassPathXmlApplicationContext("tutorial\\annotationConfig\\config.xml");

        Object o = context.getBean("coreBean");

        System.out.println(o);
    }
}
