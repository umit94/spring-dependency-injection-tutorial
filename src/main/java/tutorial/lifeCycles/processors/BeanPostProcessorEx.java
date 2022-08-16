package tutorial.lifeCycles.processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

//@Component
public class BeanPostProcessorEx implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof BeanA beanA) {
            System.out.println("\nin postProcessBeforeInitialization "+beanName);
            System.out.println("name in postProcessBeforeInitialization "+ beanA.getName());
            beanA.setName("myBeanA");
        }
        return bean;
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof BeanA beanA) {
            System.out.println("\nin postProcessAfterInitialization "+beanName);
            System.out.println("name in postProcessAfterInitialization " + beanA.getName());
        }
        return bean;
    }
}
