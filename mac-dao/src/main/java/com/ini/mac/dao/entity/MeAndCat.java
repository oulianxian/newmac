package com.ini.mac.dao.entity;


import javax.persistence.*;

/**
 * Created by ou on 2018/4/14/014.
 */
@Entity
public class MeAndCat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String myBehavior;

    @Column(nullable = false)
    private String catBehavior;

    @Column(nullable = false)
    private int attitude;

    public MeAndCat(String myBehavior, String catBehavior, int attitude) {
        this.myBehavior = myBehavior;
        this.catBehavior = catBehavior;
        this.attitude = attitude;
    }

    public MeAndCat() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMyBehavior() {
        return myBehavior;
    }

    public void setMyBehavior(String myBehavior) {
        this.myBehavior = myBehavior;
    }

    public String getCatBehavior() {
        return catBehavior;
    }

    public void setCatBehavior(String catBehavior) {
        this.catBehavior = catBehavior;
    }

    public int getAttitude() {
        return attitude;
    }

    public void setAttitude(int attitude) {
        this.attitude = attitude;
    }
}
