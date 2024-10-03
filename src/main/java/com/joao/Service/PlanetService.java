package com.joao.Service;

import java.util.Optional;

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

    public Optional<Planet> get(Long id) {
        
        return planetRepository.findById(id);
    }

    public Optional<Planet> getByName(String name) {
        
        return planetRepository.findByName(name);
    }

}
