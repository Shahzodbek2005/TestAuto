package com.testauto.testauto.models;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "suppliers")
public class Supplier implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "suppliers",cascade = CascadeType.ALL)
    private List<Supplier> suppliers;


    @ManyToOne(optional = false)
    @JoinColumn(name = "countries_id", nullable = false, referencedColumnName = "id")
    private Countries countries;


    @Column(name = "name", unique = true, nullable = false)
    private String name;

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

    public Countries getCountries() {
        return countries;
    }

    public void setCountries(Countries countries) {
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
