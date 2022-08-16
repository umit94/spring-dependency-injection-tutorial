package tutorial.javaConfigs.tests;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.env.AbstractEnvironment;
import tutorial.javaConfigs.BeanA;
import tutorial.javaConfigs.BeanConfiguration;


//@ComponentScan(basePackageClasses = {BeanConfiguration.class}) // new AnnotationConfigApplicationContext(Test.class) içindir
@Import(BeanConfiguration.class)
public class Test {
    public static void main(String[] args) {
        

        System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME,"profileA");

        //ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class); // AnnotationConfigApplicationContext ile @Bean içeren config gösteriliyorsa @Configuration annotation'ına gerek yoktur (Bu örnekte @Bean var)
        ApplicationContext context = new AnnotationConfigApplicationContext(Test.class); //Geçilen class'ın ya '@ComponentScan veya @Import' annotation'ına sahip olması gerekir yada @Bean içeren bir config olmalı (Bu örnekte @ComponentScan var)
        //ApplicationContext context=new ClassPathXmlApplicationContext("tutorial\\javaConfig\\config.xml"); // @Configuration annotationı kullanılmak zorundadır

        Object o = context.getBean("beanXYZ"); //scope prototype yapıldı ve lazy init yapıldı
        Object o2 = context.getBean(BeanA.class);

        System.out.println(o);
    }
}
