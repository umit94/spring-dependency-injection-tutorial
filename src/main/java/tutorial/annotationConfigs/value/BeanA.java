package tutorial.annotationConfigs.value;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//configde properties gösterilmediyse veya bu class'a özel farklı bir properties dosyası gösterilecek ise bu şekilde gösterilebilir
//@PropertySource("classpath:tutorial/annotationConfig/values.properties")
@Component
public class BeanA {
    @Value("${intValue}")
    private int intValue;

    @Value("${stringValue}")
    private String stringValue;

    @Value("#{beanB.stringValue}") //beanB'ye ait stringValue ya bir getter'a sahip olmalı ya da public olmalı
    private String beanBStringValue;

    public int getIntValue() {
        return intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public String getBeanBStringValue() {
        return beanBStringValue;
    }
}
