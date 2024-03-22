package org.example.config;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.aeonbits.owner.ConfigFactory;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Configuration {

    public static final ServerConfig CONFIG;

    static {
        if (System.getProperty("env") == null && System.getenv("env") == null) {
            System.setProperty("env", "qa");
        }
        CONFIG = ConfigFactory.create(ServerConfig.class);
    }

}
