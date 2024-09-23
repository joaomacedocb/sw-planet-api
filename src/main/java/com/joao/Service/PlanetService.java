package com.joao.Service;

import org.springframework.stereotype.Service;

import com.joao.api.sw_planet_api.Domain.Planet;
import com.joao.api.sw_planet_api.Repository.PlanetRepository;

@Service
public class PlanetService {
    
    private PlanetRepository planetRepository;

    public PlanetService(PlanetRepository planetRepository){
        this.planetRepository = planetRepository;
    }
    
    public Planet create(Planet planet){
        return planetRepository.save(planet);
    }

}
