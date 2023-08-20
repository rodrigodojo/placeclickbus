package com.placeclickbus.configs;

import com.placeclickbus.repositories.PlaceRepository;
import com.placeclickbus.services.PlaceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlaceConfig {

    @Bean
    PlaceService placeService(PlaceRepository placeRepository){
        return new PlaceService(placeRepository);
    }
}
