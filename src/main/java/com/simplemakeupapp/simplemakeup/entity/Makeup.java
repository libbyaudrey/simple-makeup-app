package com.simplemakeupapp.simplemakeup.entity;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Makeup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "Brand")
    private String brandName;
    @Column(name = "Product")
    private String productName;
    @Column(name = "Shade")
    private String shadeName;
    @Column(name = "Texture")
    private String texture;

    public Makeup() {
    }

    public long getId() {
        return id;
    }

    public Makeup(String brandName, String productName, String shadeName, String texture) {
        this.brandName = brandName;
        this.productName = productName;
        this.shadeName = shadeName;
        this.texture = texture;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getShadeName() {
        return shadeName;
    }

    public void setShadeName(String shadeName) {
        this.shadeName = shadeName;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }
}
