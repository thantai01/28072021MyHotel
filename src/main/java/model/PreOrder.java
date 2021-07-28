package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter @Setter
public class PreOrder extends Order{
    private String expectedStartDate;
    private String expectedEndDate;
    private int expectedAmountPerson;
    private int expectedLeaseTime;

    public PreOrder(Customer customer, String createdDatetime, String expectedStartDate, String expectedEndDate, int expectedAmountPerson, int expectedLeaseTime) {
        super(customer,createdDatetime);
        this.expectedStartDate = expectedStartDate;
        this.expectedEndDate = expectedEndDate;
        this.expectedAmountPerson = expectedAmountPerson;
        this.expectedLeaseTime = expectedLeaseTime;
    }

    public PreOrder(String expectedStartDate, String expectedEndDate, int expectedAmountPerson, int expectedLeaseTime) {
        this.expectedStartDate = expectedStartDate;
        this.expectedEndDate = expectedEndDate;
        this.expectedAmountPerson = expectedAmountPerson;
        this.expectedLeaseTime = expectedLeaseTime;
    }

    public PreOrder() {
    }
}
