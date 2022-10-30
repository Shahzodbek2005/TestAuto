package com.testauto.testauto.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "warehouse")
public class Warehouse implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "warehouse",cascade = CascadeType.ALL)
    private List<Warehouse> warehouse;
    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "inn", nullable = false, unique = true)
    private String INN;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "phone", nullable = true)
    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getINN() {
        return INN;
    }

    public void setINN(String INN) {
        this.INN = INN;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
