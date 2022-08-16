package tutorial.lifeCycles.initialization;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import utils.ClassPrintable;

@Component
@Lazy
public class BeanB implements ClassPrintable {
    public BeanB(){
        printConstructor();
    }
}
