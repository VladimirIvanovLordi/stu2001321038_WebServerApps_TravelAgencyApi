package uniplovdiv.webserverapps.travelagencyapi.api.controllers;

import org.springframework.web.bind.annotation.*;
import uniplovdiv.webserverapps.travelagencyapi.api.dtos.location.ResponseLocationDto;
import uniplovdiv.webserverapps.travelagencyapi.api.models.Location;

@RestController
@RequestMapping("/locations")
public class LocationController {

    @PostMapping
    public ResponseLocationDto createLocation(){
    }

    @GetMapping("{id}")
    public ResponseLocationDto getLocationById(long id){

    }

    @GetMapping
    public ResponseLocationDto[] getAllLocations(){
    }

    @DeleteMapping("id")
    public boolean deleteLocationById(long id){

    }

    @PutMapping
    public ResponseLocationDto updateLocation(){

    }


}
