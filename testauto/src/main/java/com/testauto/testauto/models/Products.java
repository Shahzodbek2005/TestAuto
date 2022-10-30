package com.testauto.testauto.models;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name = "products")
@Entity
public class Products implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "products", cascade = CascadeType.ALL)
    private List<Products> products;

    @Column(name = "product_code", unique = true, nullable = false)
    private Integer productCode;

    @Column(name = "name", nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
