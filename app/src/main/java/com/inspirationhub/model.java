package com.inspirationhub;

public class model {
    String name,profes,role,purl;


    model(){

    }

    public model(String name, String profes, String role, String purl) {
        this.name = name;
        this.profes = profes;
        this.role = role;
        this.purl = purl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfes() {
        return profes;
    }

    public void setProfes(String profes) {
        this.profes = profes;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }
}
