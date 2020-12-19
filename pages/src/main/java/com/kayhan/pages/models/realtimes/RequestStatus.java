/*
 * Copyright (c) 2020.
 * Author: Kayhan Swarup
 * Project: TestLibraries
 */

package com.kayhan.pages.models.realtimes;

import java.util.ArrayList;
import java.util.List;

public class RequestStatus {
    private String id;
    private String status;
    private String tripID;
    private List<Profile> drivers = new ArrayList<>();
    private Profile driver;
    private double pickupLatitude;
    private double pickupLongitude;
    private double destinationLatitude;
    private double destinationLongitude;
    private String pickupAddress;
    private String destinationAddress;

    public RequestStatus() {
    }

    public RequestStatus(String id, String status, String tripID, List<Profile> drivers, Profile driver, double pickupLatitude, double pickupLongitude, double destinationLatitude, double destinationLongitude, String pickupAddress, String destinationAddress) {
        this.id = id;
        this.status = status;
        this.tripID = tripID;
        this.drivers = drivers;
        this.driver = driver;
        this.pickupLatitude = pickupLatitude;
        this.pickupLongitude = pickupLongitude;
        this.destinationLatitude = destinationLatitude;
        this.destinationLongitude = destinationLongitude;
        this.pickupAddress = pickupAddress;
        this.destinationAddress = destinationAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTripID() {
        return tripID;
    }

    public void setTripID(String tripID) {
        this.tripID = tripID;
    }

    public List<Profile> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Profile> drivers) {
        this.drivers = drivers;
    }

    public Profile getDriver() {
        return driver;
    }

    public void setDriver(Profile driver) {
        this.driver = driver;
    }

    public double getPickupLatitude() {
        return pickupLatitude;
    }

    public void setPickupLatitude(double pickupLatitude) {
        this.pickupLatitude = pickupLatitude;
    }

    public double getPickupLongitude() {
        return pickupLongitude;
    }

    public void setPickupLongitude(double pickupLongitude) {
        this.pickupLongitude = pickupLongitude;
    }

    public double getDestinationLatitude() {
        return destinationLatitude;
    }

    public void setDestinationLatitude(double destinationLatitude) {
        this.destinationLatitude = destinationLatitude;
    }

    public double getDestinationLongitude() {
        return destinationLongitude;
    }

    public void setDestinationLongitude(double destinationLongitude) {
        this.destinationLongitude = destinationLongitude;
    }

    public String getPickupAddress() {
        return pickupAddress;
    }

    public void setPickupAddress(String pickupAddress) {
        this.pickupAddress = pickupAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }
}
