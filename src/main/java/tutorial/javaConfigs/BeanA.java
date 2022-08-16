package tutorial.javaConfigs;

import utils.ClassPrintable;

public class BeanA implements ClassPrintable {
    String beanName;

    public BeanA(String beanName){
        this.beanName=beanName;
        printConstructor();
    }

    @Override
    public String toString() {
        return "beanA name="+beanName;
    }
}
