package stefanmonko.sk.servisimoviewer;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "features")
public class FeatureProperties {
    
    @Getter @Setter private boolean canaryflag;
    @Getter @Setter private boolean expandedsearch;


}
