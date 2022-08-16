package tutorial.lifeCycles.lazy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("tutorial/lifeCycles/lazy")
public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Test.class);
        BeanA beanA = (BeanA) context.getBean("beanA");

        // beanA'nın constructor'ında beanB @Lazy olması sebebiyle yorum satırı kaldırıldığında beanB'ye erişilmek istenir ve beanB yaratılır.
        // beanB'ye erişilmek istenmediği sürece yaratılmaz
        //beanA.getBeanB().toString();

    }
}
