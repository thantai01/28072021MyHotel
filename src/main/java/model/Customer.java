package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true)
    private String memberId;

    private String firstName;
    private String lastName;
    private String dob;
    private String email;
    @Column(unique = true)
    private String identityCard;
    private String address;
    private String joinDate;
    @ManyToOne
    private CustomerLevel customerLevel;

    public Customer(String memberId, String firstName, String lastName, String dob, String identityCard, String address) {
        this.memberId = memberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.email = email;
        this.identityCard = identityCard;
        this.address = address;
        this.joinDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public Customer() {}
}
