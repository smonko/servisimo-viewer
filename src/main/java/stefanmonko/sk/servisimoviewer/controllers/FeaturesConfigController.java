package stefanmonko.sk.servisimoviewer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import stefanmonko.sk.servisimoviewer.FeatureProperties;

@RestController
public class FeaturesConfigController {
    @Autowired
    private FeatureProperties featureFlags;

    @RequestMapping(path = "/feature-flags", produces="application/json")
    public Map<String, String> showFeatures() {
    HashMap<String, String> map = new HashMap<>();

    String canaryFlag = String.valueOf(featureFlags.isCanaryflag());
    String expandedSearch = String.valueOf(featureFlags.isExpandedsearch());

    map.put("canaryflag", canaryFlag);
    map.put("expandedsearch", expandedSearch);

    return map;

    }
}
