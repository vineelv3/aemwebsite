package website.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;

@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FruitsModel {
    @Inject
    Resource componentResource;
    @Inject
    private String fruit1;

    @Inject
    private String fruit2;



    public String getFruit1() {
        return fruit1;
    }

    public String getFruit2() {
        return fruit2;
    }
}
