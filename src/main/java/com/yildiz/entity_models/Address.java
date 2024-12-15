package com.yildiz.entity_models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

import javax.naming.Name;
// embeddable gömüllebilirlik yani bir tabloya bu tabloyu gömme işini yapar
@Embeddable
public class Address {
    @Column(name = "STREET")
    private String street;
    @Column(name = "CİTY")
    private String city;
    private String state;
    @Column(name = "ZİP")
    private String zip;
}
