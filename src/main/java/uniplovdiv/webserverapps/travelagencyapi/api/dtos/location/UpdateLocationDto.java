package uniplovdiv.webserverapps.travelagencyapi.api.dtos.location;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link uniplovdiv.webserverapps.travelagencyapi.api.models.Location}
 */
@Value
public class UpdateLocationDto implements Serializable {
    Long id;
    String streetName;
    String streetNumber;
    String cityName;
    String countryName;
    String imageUrl;
}