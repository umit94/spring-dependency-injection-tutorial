package tutorial.javaConfigs;

import org.springframework.beans.factory.annotation.Autowired;
import utils.ClassPrintable;

public class BeanB implements ClassPrintable {
    private String name;

    public BeanB(String name){
        printConstructor();
        this.name=name;
    }

    @Override
    public String toString() {
        return "===>beanB name="+name;
    }
}
