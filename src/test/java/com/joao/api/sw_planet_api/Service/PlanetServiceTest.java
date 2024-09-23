package com.joao.api.sw_planet_api.Service;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.joao.Service.PlanetService;
import com.joao.api.sw_planet_api.Domain.Planet;

import static com.joao.api.sw_planet_api.Common.PlanetConstants.PLANET;

@SpringBootTest(classes = PlanetService.class)
public class PlanetServiceTest {

    @Autowired
    private PlanetService planetService;

    //operacao_estado_returno
    @Test
    public void CreatePlanet_WithValidData_ReturnsPlanet() {
        Planet sut = planetService.create(PLANET);

        assertThat(sut).isEqualTo(PLANET);
    }
    
}
