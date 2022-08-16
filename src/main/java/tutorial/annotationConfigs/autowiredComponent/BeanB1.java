package tutorial.annotationConfigs.autowiredComponent;

import org.springframework.stereotype.Component;
import utils.ClassPrintable;

@Component
public class BeanB1 implements BeanB, ClassPrintable {

    public BeanB1(){
        printDefaultConstructor();
    }

    @Override
    public String toString() {
        return getClassName();
    }
}
