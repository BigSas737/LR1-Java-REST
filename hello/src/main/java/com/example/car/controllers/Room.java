package com.example.car.controllers;

public class Room {
    private Integer id;
    private String roomInfo;
    private Integer roomCapacity;
    private double price;

    public Room(Integer id, String roomInfo, Integer roomCapacity, double price) {
        this.id = id;
        this.roomInfo = roomInfo;
        this.roomCapacity = roomCapacity;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomInfo() {
        return roomInfo;
    }

    public void setRoomInfo(String roomInfo) {
        this.roomInfo = roomInfo;
    }

    public Integer getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(Integer roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
