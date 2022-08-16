package tutorial.javaConfigs;

import org.springframework.context.annotation.*;

// ClassPathXmlApplicationContext veya FileSystemXmlApplicationContext ile @Configuration kullanılmak zorundadır
// AnnotationConfigApplicationContext ile @Configuration annotation'ına gerek yoktur
// @Component'e gerek yoktur çünkü @Configuration zaten bir @Component'dir.
@Configuration
@Lazy //Config'in tamamına veya bean bazlı verilebilir
@Profile("profileA") //Config'in tamamına veya bean bazlı verilebilir
public class BeanConfiguration {

    @Primary //Config'in tamamına scope verilemez, bean bazlı verilebilir
    @Bean
    @Scope("prototype") //Config'in tamamına scope verilemez, bean bazlı verilebilir
    public BeanA beanASD(){
        return new BeanA("ASD");
    }

    @Bean
    public BeanA beanXYZ(){
        return new BeanA("XYZ");
    }

    @Bean
    public BeanA beanQWERTY(String beanName){ //aşağıdaki beanName ismindeki bean oluşturulur ve beanName parametresine inject edilir
        return new BeanA(beanName);
    }

    @Bean
    public String beanName(){ // getBeanQWERTY tarafından çağırılır
        return "QWERTY";
    }

}
