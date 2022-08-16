package tutorial.annotationConfigs.profile;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("profileB")
@Primary
public class ProfileBBean implements ProfileBean{
    @Override
    public String toString() {
        return "profileB Bean";
    }
}
