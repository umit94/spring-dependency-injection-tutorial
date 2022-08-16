package tutorial.annotationConfigs.qualifiers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import utils.ClassPrintable;

@Component
@Qualifier("beanB2Qualifier")
public class BeanB2 implements BeanB, ClassPrintable {

    @Override
    public String toString() {
        return getClassName();
    }
}
