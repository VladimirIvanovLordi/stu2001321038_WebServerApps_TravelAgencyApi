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

    @ManyToOne(targetEntity = Location.class)
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

    public Holiday() {}

    public Holiday(long id, Location location, String title, LocalDate startDate, int duration, String price, int freeSlots) {
        this.id = id;
        this.location = location;
        this.title = title;
        this.startDate = startDate;
        this.duration = duration;
        this.price = price;
        this.freeSlots = freeSlots;
    }
}
