package tutorial.lifeCycles.initialization;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("tutorial/lifeCycles/initialization")
public class Test {
    public static void main(String[] args) {

        ApplicationContext context= new AnnotationConfigApplicationContext(Test.class);
        Object o = context.getBean("beanA"); //beanB hiçbir şekilde beanA tarafından inject edilmemesine rağmen DependsOn ile öncelikle beanB'nin oluşturulmasını sağlayabiliriz

    }
}
