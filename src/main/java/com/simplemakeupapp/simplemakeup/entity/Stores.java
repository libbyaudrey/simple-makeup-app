package com.simplemakeupapp.simplemakeup.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Stores")

public class Stores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="Store")
    private String storeName;

   @OneToMany(cascade = CascadeType.ALL)
   @JoinColumn(name = "Store", referencedColumnName = "id")
   List<Makeup> makeup = new ArrayList<>();

    public Stores(String storeName) {
        this.storeName = storeName;
    }

    public Stores() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public List<Makeup> getMakeup() {
        return makeup;
    }

    public void setMakeup(List<Makeup> makeup) {
        this.makeup = makeup;
    }
}
