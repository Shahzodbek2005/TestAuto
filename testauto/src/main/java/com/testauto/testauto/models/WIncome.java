package com.testauto.testauto.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "wincome" )
public class WIncome {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "product_id", nullable = false, referencedColumnName = "id")
    private Products products;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "document_id", nullable = false, referencedColumnName = "id")
    private Documents documents;

    @Column(name = "date", nullable = false)
    private Date date;



}
