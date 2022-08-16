package tutorial.annotationConfigs.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CoreBean {
    @Autowired
    ProfileBean profileBean;

    @Override
    public String toString() {
        return profileBean.toString();
    }
}
