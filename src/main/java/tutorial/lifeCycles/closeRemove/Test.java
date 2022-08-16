package tutorial.lifeCycles.closeRemove;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Test.class);
        context.removeBeanDefinition("beanA");
        //System.out.println((BeanA) context.getBean("beanA")); //Bean silindiği için NoSuchBeanException fırlatır
        context.close();
        //System.out.println((BeanB) context.getBean("beanB")); //context kapatıldığı için IllegalStateException fırlatır

        //Beanler silindiğinde veya context kapatıldığında Spring bu beanleri yönetmeyi bırakır, ancak bu beanler başka referanslar tarafından gösterilmeye devam ediyorsa
        // yok olmazlar. Çünkü hala kullanımda oldukları için garbage collector tarafından bellekten toplanmazlar

    }
}
