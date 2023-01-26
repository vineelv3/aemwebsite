package website.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = SlingHttpServletRequest.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class RteImpl {

    @ValueMapValue
    private String rteComponent;
    @ValueMapValue
    private String name;

    public String getRteComponent() {
        return rteComponent;
    }

    public String getName() {
        return name;
    }
}
