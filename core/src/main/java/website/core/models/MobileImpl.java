package website.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;
import java.util.*;

@Model(adaptables = SlingHttpServletRequest.class,
        adapters = Mobile.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MobileImpl implements Mobile {

    @Inject
    Resource componentResource;


    @ValueMapValue
    private String brandname;

    @ValueMapValue
    private List<String> brand;

    public String getBrandname() {
        return brandname;
    }

    @Override
    public List<Map<String, String>> getMobileDetailsMap() {
        List<Map<String, String>>mobileDetailsMap=new ArrayList<>();
        try{
            Resource brandDetail=componentResource.getChild( "branddetailswithmap");
            if(brandDetail!=null){
                for (Resource brand : brandDetail.getChildren()){
                    Map<String,String> brandMap=new HashMap<>();
                    brandMap.put("brandname",brand.getValueMap().get("brandname",String.class));
                    brandMap.put("brandsubject",brand.getValueMap().get("brandsubject",String.class));
                    brandMap.put("publishyear",brand.getValueMap().get("publishyear",String.class));
                    mobileDetailsMap.add(brandMap);
                }
            }
        }catch (Exception e){

        }
        return mobileDetailsMap;
    }

    @Override
    public List<String> getMobile() {
        if (brand != null) {
            return new ArrayList<String>(brand);
        } else {
            return Collections.emptyList();
        }


    }
}
