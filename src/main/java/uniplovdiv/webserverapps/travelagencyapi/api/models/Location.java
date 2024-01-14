package uniplovdiv.webserverapps.travelagencyapi.api.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "location")
@Data
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "street_name")
    private String streetName;

    @Column(name = "street_number")
    private String streetNumber;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "image_url")
    private String imageUrl;

    public Location() {}

    public Location(long id, String streetName, String streetNumber, String cityName, String countryName, String imageUrl) {
        this.id = id;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.cityName = cityName;
        this.countryName = countryName;
        this.imageUrl = imageUrl;
    }
}
