package com.testauto.testauto.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name = "actions")
@Entity
public class Actions implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "actions",cascade = CascadeType.ALL)
    private List<Actions> actions;
    @Column(name = "name", unique = true, nullable = false)
    private String name;

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
