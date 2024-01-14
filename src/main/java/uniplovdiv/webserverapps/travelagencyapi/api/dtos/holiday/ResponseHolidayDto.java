package uniplovdiv.webserverapps.travelagencyapi.api.dtos.holiday;

import lombok.Value;
import uniplovdiv.webserverapps.travelagencyapi.api.dtos.location.ResponseLocationDto;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link uniplovdiv.webserverapps.travelagencyapi.api.models.Holiday}
 */
@Value
public class ResponseHolidayDto implements Serializable {
    long id;
    ResponseLocationDto location;
    String title;
    LocalDate startDate;
    int duration;
    String price;
    int freeSlots;
}