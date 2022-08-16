package tutorial.lifeCycles.processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.SmartLifecycle;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanA implements SmartLifecycle {
    @Autowired
    private String name;
    private boolean isRunning;

    public BeanA(){
        System.out.println("\nin constructor");
        System.out.println("name in constructor "+name);
    }

    @Override
    public void start() {
        System.out.println("\nin start");
        System.out.println("name in start "+ name);
        isRunning=true;
    }

    @Override
    public void stop() {
        System.out.println("\nin stop");
        isRunning=false;
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bean
    private String name(){
        System.out.println("\ndependency initialization");
        return "defautName";
    }
}
