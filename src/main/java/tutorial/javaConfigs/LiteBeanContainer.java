package tutorial.javaConfigs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class LiteBeanContainer {

    private BeanB beanB;

    @Autowired //Injection yapılan yerde @Lazy verilirse nesne injection sırasında değil yalnızca kullanılmak(erişilmek) istendiğinde yaratılır, injection sırasında proxy kullanılır
    public LiteBeanContainer(@Lazy BeanB beanB){
        this.beanB=beanB;
    }

    @Bean //Lite Bean // Component içerisinde bulunan beandir
    // constructor injectionlarda methodun constructor tarafından çağırılabilmesi için instance değil class(static) method olması gerekmektedir
    //setter injection veya field injection yapılırken static olmasına gerek yoktur
    @Lazy
    public static BeanB beanB(String name){
        return new BeanB(name);
    }

    @Bean //Lite Bean // Component içerisinde bulunan beandir
    public static String name(){
        return "beanB";
    }

    @Override
    public String toString() {
        return "BeanA"+beanB.toString();
    }
}
