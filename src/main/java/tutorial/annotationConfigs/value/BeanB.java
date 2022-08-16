package tutorial.annotationConfigs.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
    @Value("${beanBStringValue}")
    private String stringValue="xyz"; //@Value ile değer geçilebilir veya kendimiz bir değer geçebiliriz

    public String getStringValue() {
        return stringValue;
    }
}
