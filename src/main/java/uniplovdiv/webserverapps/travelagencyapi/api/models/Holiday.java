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
    private Long id;

    @ManyToOne(targetEntity = Location.class)
    private Location location;

    @Column(name = "title")
    private String title;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "duration")
    private int duration;

    @Column(name = "price")
    private String price;

    @Column(name = "free_slots")
    private int freeSlots;

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
