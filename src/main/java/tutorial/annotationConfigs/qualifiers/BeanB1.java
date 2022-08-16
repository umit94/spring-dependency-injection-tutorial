package tutorial.annotationConfigs.qualifiers;

import org.springframework.stereotype.Component;
import utils.ClassPrintable;

@Component
public class BeanB1 implements BeanB, ClassPrintable {

    @Override
    public String toString() {
        return getClassName();
    }
}
