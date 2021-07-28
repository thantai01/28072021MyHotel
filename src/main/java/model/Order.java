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
    private String createdDatetime;

    public Order(Customer customer, String createdDatetime) {
        this.customer = customer;
        this.createdDatetime = createdDatetime;
    }

    public Order() {}
}
