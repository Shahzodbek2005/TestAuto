package com.testauto.testauto.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name = "countries")
@Entity
public class Countries implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @OneToMany(mappedBy = "countries", cascade = CascadeType.ALL)
    private List<Countries> countries;

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
}
