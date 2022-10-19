package com.nestdigital.flightBackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flight_db")
public class FlightModel {
    @Id
    @GeneratedValue
    private int id;
    private String fName;
    private String Origin;
    private String destination;
    private int capacity;

    public FlightModel(int id, String fName, String origin, String destination, int capacity) {
        this.id = id;
        this.fName = fName;
        Origin = origin;
        this.destination = destination;
        this.capacity = capacity;
    }

    public FlightModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
