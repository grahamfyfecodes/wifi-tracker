package com.fyfe.graham.wifitracker.repository.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WifiConnection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String connectionDetails;

    public WifiConnection(String connectionDetails) {
        this.connectionDetails = connectionDetails;
    }

    public WifiConnection() {
    }

    public long getId() {
        return id;
    }

    public String getConnectionDetails() {
        return connectionDetails;
    }

    @Override
    public String toString() {
        return "WifiConnection{" +
                "id=" + id +
                ", connectionDetails='" + connectionDetails + '\'' +
                '}';
    }
}
