package tutorial.annotationConfigs.qualifiers;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import utils.ClassPrintable;

@Component
@Primary
public class BeanB3 implements BeanB, ClassPrintable {
    @Override
    public String toString() {
        return getClassName();
    }
}
