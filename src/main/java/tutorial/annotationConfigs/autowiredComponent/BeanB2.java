package tutorial.annotationConfigs.autowiredComponent;

import org.springframework.stereotype.Component;
import utils.ClassPrintable;

@Component
public class BeanB2 implements BeanB, ClassPrintable {
    public BeanB2(){
        printDefaultConstructor();
    }

    @Override
    public String toString() {
        return getClassName();
    }
}
