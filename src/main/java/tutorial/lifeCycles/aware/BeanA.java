package tutorial.lifeCycles.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BeanA implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    private BeanFactory beanFactory;
    private String name;
    private ApplicationContext applicationContext;



    //Aşağıda override edilen methodlar bean oluşturulurken çağırılır ve bean üzerinden erişilmesi istenilen bilgileri set ederler
    @Override //BeanFactoryAware
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException { //bean içerisinden factory'e ulaşılmasını sağlar
        this.beanFactory=beanFactory;
    }

    @Override //BeanNameAware
    public void setBeanName(String s) { //bean içerisinden bean name'e ulaşılmasını sağlar
        this.name=s;
    }

    @Override //ApplicationContextAware
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException { //bean içerisinden context'e ulaşılmasını sağlar
        this.applicationContext=applicationContext;
    }





    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public String getName() {
        return name;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
