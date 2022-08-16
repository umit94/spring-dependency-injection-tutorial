package tutorial.annotationConfigs.profile;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("profileA")
@Primary
public class ProfileABean implements ProfileBean{
    @Override
    public String toString() {
        return "profile ABean";
    }
}
