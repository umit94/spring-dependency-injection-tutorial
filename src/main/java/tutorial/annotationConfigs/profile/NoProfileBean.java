package tutorial.annotationConfigs.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class NoProfileBean implements ProfileBean{
    @Override
    public String toString() {
        return "No profile bean";
    }
}
