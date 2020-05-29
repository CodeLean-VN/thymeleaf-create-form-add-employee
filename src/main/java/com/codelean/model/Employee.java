package com.codelean.model;

public class Employee {
    private int id;
    private String name;
    private String address;
    private String email;
    private String gender;
    private String[] favorites;
    private String position;


    public Employee() {

    }

    public Employee(int id, String name, String address) {

    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFavorites(String[] favorites) {
        this.favorites = favorites;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getPosition() {
        return position;
    }

    public String[] getFavorites() {
        return favorites;
    }

}