package website.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Model(adaptables = SlingHttpServletRequest.class,
        adapters = Multifield.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MultifieldImpl implements Multifield{
    @Inject
    Resource componentResource;

    @ValueMapValue
    private String companyname;

    @ValueMapValue
    private List<String> cbrand;

    @ValueMapValue
    private String cbrandname;

    @ValueMapValue
    private String cbrandsubject;

    @ValueMapValue
    private String cpublishyear;

    public String getCompanyname() {

        return companyname;
    }
    public String getCbrandname() {
        return cbrandname;
    }
    public String getCbrandsubject() {
        return cbrandsubject;
    }
    public String getCpublishyear() {
        return cpublishyear;
    }

    @Override
    public List<String> getCompanybrand() {
        if (cbrand != null) {
            return new ArrayList<String>(cbrand);
        } else {
            return Collections.emptyList();
        }
    }
}
