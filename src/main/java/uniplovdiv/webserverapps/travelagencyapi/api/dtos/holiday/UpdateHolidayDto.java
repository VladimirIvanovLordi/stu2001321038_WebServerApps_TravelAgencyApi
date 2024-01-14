package uniplovdiv.webserverapps.travelagencyapi.api.dtos.holiday;

import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link uniplovdiv.webserverapps.travelagencyapi.api.models.Holiday}
 */
@Value
public class UpdateHolidayDto implements Serializable {
    long id;
    long locationId;
    String title;
    LocalDate startDate;
    int duration;
    String price;
    int freeSlots;
}