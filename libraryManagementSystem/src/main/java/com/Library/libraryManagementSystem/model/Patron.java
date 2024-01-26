package com.Library.libraryManagementSystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.NoArgsConstructor;

@Entity
@Table(name = "Patron" , uniqueConstraints = { @UniqueConstraint(columnNames = { "phone_no", "isActive" }) })
//@AllArgsConstructor
//@Builder
public class Patron {
    @Id
    @GeneratedValue
    private long id;
    @NotEmpty(message = "Name must not be empty")
    private String name;
    @Column( unique = true)
    @Pattern(regexp = "^\\d{10}$" , message = "Invalid Phone Number")
    private String phoneNo;
    @Email(message = "invalid Email Address")
    private String email;

    public Patron(){

    }

    public Patron(String name, String phoneNo , String email) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
