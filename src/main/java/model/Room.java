package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter @Getter

public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private RoomType roomType;
    private String name;
    private String description;
    private double releasePrice;
    private int status;

    public Room() {
    }

    public Room(RoomType roomType, String name, String description, double releasePrice, int status) {
        this.roomType = roomType;
        this.name = name;
        this.description = description;
        this.releasePrice = releasePrice;
        this.status = status;
    }
}
