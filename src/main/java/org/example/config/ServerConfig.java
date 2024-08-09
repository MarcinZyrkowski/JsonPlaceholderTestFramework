package org.example.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config-${env}.properties",
        "classpath:config-qa.properties",
        "system:properties",
        "system:env"})
public interface ServerConfig extends Config {

    @Key("environment.baseUrl")
    String baseUrl();

}
