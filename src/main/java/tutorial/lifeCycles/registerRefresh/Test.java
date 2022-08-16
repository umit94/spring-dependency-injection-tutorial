package tutorial.lifeCycles.registerRefresh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(BeanA.class);
        context.refresh(); // AnnotationConfigApplicationContext'de yalnızca bir kere refresh edilebilir
        context.register(BeanB.class); //refresh sonrası register ediliği için BeanB lazy gibi mi davranıyor?

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        BeanB beanB=(BeanB)context.getBean("beanB"); //BeanB'ye ulaşmak istediğimde constructor çağrısı yapılıyor. Lazy gibi davranıyor.
        //beanB.printClassName();
    }
}
