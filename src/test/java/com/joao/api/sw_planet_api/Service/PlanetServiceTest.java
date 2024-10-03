package com.joao.api.sw_planet_api.Service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.joao.Service.PlanetService;
import com.joao.api.sw_planet_api.Domain.Planet;
import com.joao.api.sw_planet_api.Repository.PlanetRepository;

import static com.joao.api.sw_planet_api.Common.PlanetConstants.PLANET;
import static com.joao.api.sw_planet_api.Common.PlanetConstants.INVALID_PLANET;

@ExtendWith(MockitoExtension.class)
public class PlanetServiceTest {

    @InjectMocks
    private PlanetService planetService;

    @Mock
    private PlanetRepository planetRepository;

    //operacao_estado_returno
    @Test
    public void createPlanet_WithValidData_ReturnsPlanet() {

        //Arrange
        when(planetRepository.save(PLANET)).thenReturn(PLANET);

        //Act
        Planet sut = planetService.create(PLANET);

        //Assert
        assertThat(sut).isEqualTo(PLANET);
    }

    @Test
    public void createPlanet_WithInvalidData_ThrowsException() {

        //arrange
        when(planetRepository.save(INVALID_PLANET)).thenThrow(RuntimeException.class);

        //assert
        assertThatThrownBy(() -> planetService.create(INVALID_PLANET)).isInstanceOf(RuntimeException.class);

        
    }

    @Test
    public void getPlanet_ByExistingId_ReturnsPlanet(){
        when(planetRepository.findById(1L)).thenReturn(Optional.of(PLANET));

        Optional<Planet> sut = planetService.get(1L);

        assertThat(sut).isNotEmpty();
        assertThat(sut.get()).isEqualTo(PLANET);

    }

    @Test
    public void getPlanet_byUnexistingId_ReturnsEmpty(){
        when(planetRepository.findById(1L)).thenReturn(Optional.empty());

        Optional<Planet> sut = planetService.get(1L);

        assertThat(sut).isEmpty();

    }
    
}
