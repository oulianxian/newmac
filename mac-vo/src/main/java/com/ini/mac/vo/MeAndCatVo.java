package com.ini.mac.vo;

/**
 * Created by ou on 2018/4/15/015.
 */
public class MeAndCatVo {

    private Long id;
    private String myBehavior;
    private String catBehavior;
    private int attitude;

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
