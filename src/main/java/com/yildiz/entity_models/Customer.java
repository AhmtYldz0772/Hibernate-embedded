package com.yildiz.entity_models;

import jakarta.persistence.*;

import java.util.Date;

// entity ile model arasında fark entity anatasyonu verildi ise o tablosu veritabanında mutkala oluşur
// modelde ise yapmak zorunda değilsin

@Entity
@Table(name = "CUSTOMERS")
public class Customer {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "CUSTOMER_İD")
     private int id;
    @Column(name = "FIRST_NAME")
     private String firstName ;
    @Column(name = "LAST_NAME")
     private String lastName ;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_CREAT")
    private Date createDate;
/*
    @Column(name = "ADRESS")
    private String adress;
*/
    @Embedded
    private Address address;


    public Customer() {
    }
    public Customer(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(int id, String firstName, String lastName, Date createDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
/*
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
*/
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
