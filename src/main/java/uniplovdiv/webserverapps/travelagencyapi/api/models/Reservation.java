package uniplovdiv.webserverapps.travelagencyapi.api.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "reservation")
@Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(name = "contact_name")
    String contactName;

    @Column(name = "phone_number")
    String phoneNumber;

    @Column(name = "holiday")
    Holiday holiday;
}