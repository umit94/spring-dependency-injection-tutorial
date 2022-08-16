package tutorial.javaConfigs.tests;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tutorial.javaConfigs.LiteBeanContainer;


public class Lite {
    public static void main(String[] args) {
        

        ApplicationContext context = new AnnotationConfigApplicationContext(LiteBeanContainer.class);

        Object o = context.getBean("liteBeanContainer"); //BeanB, liteBeanContainer tarafından inject edilmesine rağmen BeanB'ye ulaşmadığımız için gerçek BeanB nesnesi yaratılır ve constructor'ındaki sout çalışmaz
        //System.out.println(o); // Yorum satırı kaldırıldığında liteBeanContainer içerisindeki beanB'ye ulaşmaya çalışacağından beanB nesnesi yaratılır
    }
}
