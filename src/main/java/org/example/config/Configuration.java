package org.example.config;

import org.aeonbits.owner.ConfigFactory;

public class Configuration {

    public static final ServerConfig CONFIG;

    static {
        if (System.getProperty("env") == null && System.getenv("env") == null) {
            System.setProperty("env", "qa");
        }
        CONFIG = ConfigFactory.create(ServerConfig.class);
    }

}
