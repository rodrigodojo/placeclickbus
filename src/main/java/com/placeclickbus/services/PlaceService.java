package com.placeclickbus.services;

import com.placeclickbus.domains.Place;
import com.placeclickbus.repositories.PlaceRepository;
import reactor.core.publisher.Mono;

public class PlaceService {

    private PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository){
        this.placeRepository = placeRepository;
    }

    public Mono<Place> create(Place place){
        return placeRepository.save(place);
    }

}
