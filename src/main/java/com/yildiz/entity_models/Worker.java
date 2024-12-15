package com.yildiz.entity_models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Size;

import java.util.Date;
@Entity
@Table(name = "Workers")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "WORKER_ID")
    private int id;
    @Column(name = "FIRST_NAME")
    private String firstName ;
    @Column(name = "LAST_NAME")
    private String lastName ;

    @Size(min = 1, max = 50)
    @Column(name = "AGE")
    private String age ;

    @Email
    @Column(name = "EMAİL")
    private String email ;
    @Column(name = "PHONE")
    private String phone ;

    @FutureOrPresent
    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_CREAT")
    private Date createDate;

    @Embedded
    private Address address;

    public Worker() {
    }

    public Worker(int id, String lastName, String firstName, String age, String email, String phone, Date createDate) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.email = email;
        this.phone = phone;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
