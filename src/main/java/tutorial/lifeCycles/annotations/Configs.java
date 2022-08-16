package tutorial.lifeCycles.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configs {
    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod") //postConstruct ve preDestroy methodları
    public BeanA beanA(){
        return new BeanA();
    }

    @Bean//(destroyMethod = "") //Bean içerisinde verilen close() veya shutdown() methodu boş string verilerek override edilebilir
    public BeanB beanB(){
        return new BeanB();
    }
}
