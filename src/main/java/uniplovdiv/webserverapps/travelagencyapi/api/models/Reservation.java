package uniplovdiv.webserverapps.travelagencyapi.api.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "reservation")
@Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "contact_name")
    private String contactName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @ManyToOne(targetEntity = Holiday.class)
    private Holiday holiday;

    public Reservation() {}

    public Reservation(long id, String contactName, String phoneNumber, Holiday holiday) {
        this.id = id;
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
        this.holiday = holiday;
    }


}
