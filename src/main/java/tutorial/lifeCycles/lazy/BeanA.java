package tutorial.lifeCycles.lazy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import utils.ClassPrintable;

@Component
@Lazy
public class BeanA implements ClassPrintable {
    private BeanB beanB;

    @Autowired
    public BeanA(@Lazy BeanB beanB){ // parametre @Lazy olduğunda sadece bu bean'e erişilmek istendiğinde bean oluşturulur (bean'in kendisi de lazy olmalıdır)
        printConstructor();
        this.beanB=beanB;
    }

    public BeanB getBeanB() {
        return beanB;
    }
}
