package uniplovdiv.webserverapps.travelagencyapi.api.controllers;

import org.springframework.web.bind.annotation.*;
import uniplovdiv.webserverapps.travelagencyapi.api.dtos.location.CreateLocationDto;
import uniplovdiv.webserverapps.travelagencyapi.api.dtos.location.ResponseLocationDto;
import uniplovdiv.webserverapps.travelagencyapi.api.dtos.location.UpdateLocationDto;
import uniplovdiv.webserverapps.travelagencyapi.api.models.Location;
import uniplovdiv.webserverapps.travelagencyapi.api.repositories.LocationRepository;

//TODO
/*
@RestController
@RequestMapping("/locations")
public class LocationController {

    LocationRepository locationRepository;

    @PostMapping
    public ResponseLocationDto createLocation(CreateLocationDto createLocationDto){
        Location location = locationRepository.save(new Location(createLocationDto.getStreetName(), createLocationDto.getStreetNumber()
                                ,createLocationDto.getCityName(), createLocationDto.getCountryName(), createLocationDto.getImageUrl()));

        return new ResponseLocationDto(location.getId(), location.getStreetName(), location.getStreetNumber()
                                        ,location.getCityName(), location.getCountryName(), location.getImageUrl());
    }

    @GetMapping("{id}")
    public ResponseLocationDto getLocationById(long id){
        locationRepository
    }

    @GetMapping
    public ResponseLocationDto[] getAllLocations(){
    }

    @DeleteMapping("id")
    public boolean deleteLocationById(long id){
    }

    @PutMapping
    public ResponseLocationDto updateLocation(UpdateLocationDto updateLocationDto){
    }


}

 */




