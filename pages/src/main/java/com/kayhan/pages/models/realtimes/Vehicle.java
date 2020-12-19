/*
 * Copyright (c) 2020.
 * Author: Kayhan Swarup
 * Project: TestLibraries
 */

package com.kayhan.pages.models.realtimes;

public class Vehicle {
    private String id;
    private String driverID;
    private String brandName;
    private String modelName;
    private String vehicleRegistrationNumber;

    public Vehicle() {
    }

    public Vehicle(String id, String driverID, String brandName, String modelName, String vehicleRegistrationNumber) {
        this.id = id;
        this.driverID = driverID;
        this.brandName = brandName;
        this.modelName = modelName;
        this.vehicleRegistrationNumber = vehicleRegistrationNumber;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getVehicleRegistrationNumber() {
        return vehicleRegistrationNumber;
    }

    public void setVehicleRegistrationNumber(String vehicleRegistrationNumber) {
        this.vehicleRegistrationNumber = vehicleRegistrationNumber;
    }
}
