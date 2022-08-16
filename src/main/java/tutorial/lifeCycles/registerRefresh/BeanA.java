package tutorial.lifeCycles.registerRefresh;

import utils.ClassPrintable;

public class BeanA implements ClassPrintable {

    public BeanA(){
        printConstructor();
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
