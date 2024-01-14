package uniplovdiv.webserverapps.travelagencyapi.api.dtos.reservation;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link uniplovdiv.webserverapps.travelagencyapi.api.models.Reservation}
 */
@Value
public class CreateReservationDto implements Serializable {
    String contactName;
    String phoneNumber;
    Long holidayId;
}