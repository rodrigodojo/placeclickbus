package com.placeclickbus.repositories;

import com.placeclickbus.domains.Place;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PlaceRepository extends ReactiveCrudRepository<Place,Long> {
}
