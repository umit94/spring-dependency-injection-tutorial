package tutorial.lifeCycles.initialization;

import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import utils.ClassPrintable;

@Component
@Lazy
@DependsOn("beanB") //beanB hiçbir şekilde inject edilmemesine rağmen DependsOn ile öncelikle beanB'nin oluşturulmasını sağlayabiliriz
public class BeanA implements ClassPrintable {

    public BeanA(){
        printConstructor();
    }
}
