package com.joao.api.sw_planet_api.Repository;

import org.springframework.data.repository.CrudRepository;

import com.joao.api.sw_planet_api.Domain.Planet;

public interface PlanetRepository extends CrudRepository<Planet, Long> {
    
}
