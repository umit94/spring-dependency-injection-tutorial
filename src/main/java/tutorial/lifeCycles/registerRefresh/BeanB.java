package tutorial.lifeCycles.registerRefresh;

import utils.ClassPrintable;

public class BeanB implements ClassPrintable {

    public BeanB(){
        printConstructor();
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
