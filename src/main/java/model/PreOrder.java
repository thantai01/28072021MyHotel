package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Getter @Setter
@AllArgsConstructor
public class PreOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String customerName;
    private String customerPhone;
    private String createdTime;
    private String expectedStartDate;
    private String expectedEndDate;
    private int expectedAmountPerson;
    private int expectedLeaseTime;

    public PreOrder(String customerName, String customerPhone, String expectedStartDate, String expectedEndDate, int expectedAmountPerson, int expectedLeaseTime) {
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.createdTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        this.expectedStartDate = expectedStartDate;
        this.expectedEndDate = expectedEndDate;
        this.expectedAmountPerson = expectedAmountPerson;
        this.expectedLeaseTime = expectedLeaseTime;
    }

    public PreOrder() {
    }
}
