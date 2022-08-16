package tutorial.annotationConfigs.qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import utils.ClassPrintable;

@Component
public class BeanA implements ClassPrintable {
    @Autowired
    @Qualifier("beanB1") //Bu qualifier'a sahip bir class yok ise bu isme sahip bir class arar.
    private BeanB beanABC;

    @Autowired
    @Qualifier("beanB2Qualifier") //qualifier ile bu qualifier'a sahip class'ın inject edileceği belirtilir
    private BeanB beanXYZ;

    @Autowired
    //@Qualifier'a sahip olmadığı için @Primary ile öncelik tanınmış BeanB3 classından bir nesne inject eder.
    // @Primary'e sahip bir BeanB implementasyonu yok ise BeanB'yi implement eden BeanASD adında bir class arar, bulamaz ise exception fırlatır
    private BeanB beanASD;

    @Autowired
    public BeanA(@Qualifier("beanB1") BeanB beanABC,@Qualifier("beanB2Qualifier") BeanB beanXYZ){
        System.out.println(this.beanABC);
        printSmartConstructor();
    }

    @Override
    public String toString() {
        return beanABC.toString()+" "+beanXYZ.toString()+" "+beanASD.toString();
    }
}
