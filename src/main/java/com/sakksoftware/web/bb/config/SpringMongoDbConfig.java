package com.sakksoftware.web.bb.config;

import com.fasterxml.jackson.databind.Module;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.geo.GeoJsonModule;

@Configuration
public class SpringMongoDbConfig {

    @Bean
    public Module registerGeoJsonModule(){
        return new GeoJsonModule();
    }
}
