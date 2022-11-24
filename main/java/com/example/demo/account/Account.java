package com.example.demo.account;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.time.LocalDate;
import java.time.Period;
import javax.persistence.*;

@Entity
@Table
public class Account {
    @Id
    @SequenceGenerator(
            name = "account_sequence",
            sequenceName = "account_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "account_sequence"

    )
    private Long id;
    private String name;
    private String email;
    private String address;
    private Boolean isStaff;

    public Account(Long id, String name, String email, String address, Boolean isStaff) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.isStaff = isStaff;
    }

    public Account() {
    }

    public Account(String name, String email, String address, Boolean isStaff) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.isStaff = isStaff;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public Boolean getIsStaff() {
        return isStaff;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setIsStaff(Boolean isStaff) {
        this.isStaff = isStaff;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", isStaff=" + isStaff +
                '}';
    }
}
