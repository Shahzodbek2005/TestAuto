package com.testauto.testauto.models;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "documents")
public class Documents implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "doc_number")
    String docNumber;


    @ManyToOne(optional = false)
    @JoinColumn(name = "suppliers_id",nullable = false,referencedColumnName = "id")
    private Supplier supplier;

    @ManyToOne(optional = false)
    @JoinColumn(name = "warehouse_id",nullable = false,referencedColumnName = "id")
    private Warehouse warehouse;

    @ManyToOne(optional = false)
    @JoinColumn(name = "actions_id",nullable = false,referencedColumnName = "id")
    private Actions actions;

    @OneToMany(mappedBy = "documents", cascade = CascadeType.ALL)
    private List<Documents> documents;

    @Column(name = "date")
    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Actions getActions() {
        return actions;
    }

    public void setActions(Actions actions) {
        this.actions = actions;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
