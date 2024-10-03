package com.joao.Service;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

import com.joao.api.sw_planet_api.Domain.Planet;

public class QueryBuilder {
    public static Example<Planet> makeQuery(Planet planet) {
        ExampleMatcher exampleMatcher = ExampleMatcher.matchingAll().withIgnoreCase().withIgnoreNullValues();
        return Example.of(planet, exampleMatcher);
    }
}
