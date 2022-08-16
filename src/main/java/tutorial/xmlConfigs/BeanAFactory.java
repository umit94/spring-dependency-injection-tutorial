package tutorial.xmlConfigs;

public class BeanAFactory {
    public BeanA createBean(BeanB beanB, int secondArg){
        System.out.println("\nCreating by factory");
        return new BeanA(beanB);
    }
}
