package exercises.javaConfig.calculator;

import exercises.javaConfig.calculator.function.Cos;
import exercises.javaConfig.calculator.function.Sin;
import exercises.javaConfig.calculator.function.Log;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.bind.Name;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfig {


    //Aşağıdaki şekilde Calculator bean'i oluşturulabilir yada Calculator'ı Component yapıp, AutoWired ile bu configde oluşturulan beanleri alması sağlanarak Calculator bean'i oluşturulabilir
//    @Bean
//    public Calculator calculator(Cos cos, Sin sin, Log log){
//        System.out.println("calc constructor");
//        return new Calculator(cos, sin, log);
//    }

    @Bean
    public Cos cos(){
        return new Cos();
    }

    @Bean
    public Sin sin(){
        return new Sin();
    }

    @Bean
    public Log log(){
        return new Log();
    }
}
