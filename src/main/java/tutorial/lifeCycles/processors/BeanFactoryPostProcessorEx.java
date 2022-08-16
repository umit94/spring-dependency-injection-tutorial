package tutorial.lifeCycles.processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BeanFactoryPostProcessorEx implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        configurableListableBeanFactory.addBeanPostProcessor(new BeanPostProcessorEx());
        System.out.println("\nin postProcessBeanFactory");
        System.out.println("name in postProcessBeanFactory "+((BeanA) configurableListableBeanFactory.getBean("beanA")).getName());
    }
}
