package tutorial.lifeCycles.annotations;

public class BeanA {

    public void initMethod(){
        System.out.println("beanA initMethod");
    }

    public void destroyMethod(){
        System.out.println("beanA destroyMethod");
    }
}
