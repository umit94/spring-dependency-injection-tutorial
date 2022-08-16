package tutorial.lifeCycles.predestroyPostConstruct;

import org.springframework.stereotype.Component;
import utils.ClassPrintable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanB implements ClassPrintable {

    @PostConstruct
    private void postConstruct(){
        printPostConstruct();
    }

    @PreDestroy
    private void preDestroy(){
        printPreDestroy();
    }
}
