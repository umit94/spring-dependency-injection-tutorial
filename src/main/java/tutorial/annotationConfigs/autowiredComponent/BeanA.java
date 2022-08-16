package tutorial.annotationConfigs.autowiredComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import utils.ClassPrintable;

//@Component(value="beanA")
//@Component //lower camel case olarak class ismini alır => "beanA"
@Component("beanA")
@Scope("prototype") //prototype veya singleton durumunu seçebiliriz
public class BeanA implements ClassPrintable {
    private BeanB beanB;

    public BeanA(){
        printDefaultConstructor();
    }

    @Autowired //Tek constructor varsa autowired kullanmaya gerek yoktur
    public BeanA(BeanB beanB1){ //Birden fazla BeanB'yi implement eden class varsa parametre "ismine" bakarak hangi classın nesnesi geçilmesi gerektiğine karar verir.
        // public BeanA(BeanB beanB1) yapıldığında BeanB'yi implement eden ve beanB1 ismine sahip component geçilir, beanB1 ismine sahip component yoksa BeanB'yi implement eden birden fazla class olduğundan exception fırlatır
        // public BeanA(BeanB beanB) yapıldığında BeanB'yi implement eden birden fazla class olduğundan exception fırlatır

        this.beanB=beanB1;
        printSmartConstructor();
    }

    @Override
    public String toString() {
        return beanB.toString();
    }
}
