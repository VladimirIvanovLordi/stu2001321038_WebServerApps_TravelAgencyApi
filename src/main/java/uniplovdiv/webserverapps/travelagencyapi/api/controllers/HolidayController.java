package uniplovdiv.webserverapps.travelagencyapi.api.controllers;

import org.springframework.web.bind.annotation.*;
import uniplovdiv.webserverapps.travelagencyapi.api.dtos.holiday.CreateHolidayDto;
import uniplovdiv.webserverapps.travelagencyapi.api.dtos.holiday.ResponseHolidayDto;
import uniplovdiv.webserverapps.travelagencyapi.api.dtos.holiday.UpdateHolidayDto;
import uniplovdiv.webserverapps.travelagencyapi.api.models.Location;
import uniplovdiv.webserverapps.travelagencyapi.api.repositories.HolidayRepository;

import java.time.LocalDate;

//TODO
/*
@RestController
@RequestMapping("/holidays")
public class HolidayController {

    HolidayRepository holidayRepository;

    @PostMapping
    public ResponseHolidayDto createHoliday(CreateHolidayDto createHolidayDto){
    }

    @GetMapping("{id}")
    public ResponseHolidayDto getHolidayById(long id){
    }

    @GetMapping
    public ResponseHolidayDto[] getAllHolidays(){
    }

    @GetMapping
    public ResponseHolidayDto[] getHolidaysByStartDate(LocalDate startDateToSearch){
    }

    @GetMapping
    public ResponseHolidayDto[] getHolidaysByDuration(int durationToSearch){
    }

    @GetMapping
    public ResponseHolidayDto[] getHolidaysByDuration(Location locationToSearch){
    }

    @DeleteMapping("id")
    public boolean deleteHolidayById(){
    }

    @PutMapping
    public ResponseHolidayDto updateHoliday(UpdateHolidayDto updateHolidayDto){
    }
}

 */

