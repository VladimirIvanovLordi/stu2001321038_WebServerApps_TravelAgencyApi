package uniplovdiv.webserverapps.travelagencyapi.api.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "holiday")
@Data
public class Holiday {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(name = "location")
    Location location;

    @Column(name = "title")
    String title;

    @Column(name = "start_date")
    LocalDate startDate;

    @Column(name = "duration")
    int duration;

    @Column(name = "price")
    String price;

    @Column(name = "free_slots")
    int freeSlots;
}
