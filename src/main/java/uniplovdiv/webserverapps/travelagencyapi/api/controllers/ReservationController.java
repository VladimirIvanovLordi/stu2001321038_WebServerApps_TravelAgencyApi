package uniplovdiv.webserverapps.travelagencyapi.api.controllers;

import org.springframework.web.bind.annotation.*;
import uniplovdiv.webserverapps.travelagencyapi.api.dtos.reservation.CreateReservationDto;
import uniplovdiv.webserverapps.travelagencyapi.api.dtos.reservation.ResponseReservationDto;
import uniplovdiv.webserverapps.travelagencyapi.api.dtos.reservation.UpdateReservationDto;
import uniplovdiv.webserverapps.travelagencyapi.api.repositories.ReservationRepository;

//TODO
/*
@RestController
@RequestMapping("/reservations")
public class ReservationController {

    ReservationRepository reservationRepository;

    @PostMapping
    public ResponseReservationDto createReservation(CreateReservationDto createReservationDto){
    }

    @GetMapping("id")
    public ResponseReservationDto getReservationById(long id){
    }

    @GetMapping
    public ResponseReservationDto[] getAllReservations(){
    }

    @DeleteMapping("{id}")
    public boolean deleteReservationById(long id){
    }

    @PutMapping
    public ResponseReservationDto updateReservation(UpdateReservationDto updateReservationDto){
    }
}

 */