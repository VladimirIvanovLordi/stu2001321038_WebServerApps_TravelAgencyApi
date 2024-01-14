package uniplovdiv.webserverapps.travelagencyapi.api.dtos.reservation;

import lombok.Value;
import uniplovdiv.webserverapps.travelagencyapi.api.dtos.holiday.ResponseHolidayDto;

import java.io.Serializable;

/**
 * DTO for {@link uniplovdiv.webserverapps.travelagencyapi.api.models.Reservation}
 */
@Value
public class ResponseReservationDto implements Serializable {
    Long id;
    String contactName;
    String phoneNumber;
    ResponseHolidayDto holiday;
}