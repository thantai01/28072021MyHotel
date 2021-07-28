package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Customer customer;
    private String ordCreatedTime;
    @OneToOne
    private Room room;
    private String startTime;
    private String endTime;

    public Order(Customer customer, String createdTime) {
        this.customer = customer;
        this.ordCreatedTime = createdTime;
    }

    public Order(Customer customer, String createdDatetime, Room room, String startTime, String endTime) {
        this.customer = customer;
        this.ordCreatedTime = createdDatetime;
        this.room = room;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Order() {}
}
