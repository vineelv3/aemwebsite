package website.core.models;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import java.util.List;
import java.util.Map;

public interface Mobile {

    public List<Map<String, String>> getMobileDetailsMap();
    public List<String> getMobile();

}
