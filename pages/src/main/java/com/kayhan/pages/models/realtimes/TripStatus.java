/*
 * Copyright (c) 2020.
 * Author: Kayhan Swarup
 * Project: TestLibraries
 */

package com.kayhan.pages.models.realtimes;

import java.util.ArrayList;
import java.util.List;

public class TripStatus {
    private String id;
    private long acceptsAt;
    private long requestsAt;
    private long startsAt;
    private long endsAt;
    private String status;
    private String driverID;
    private String userID;
    private String vehicleID;
    private String vehicleType;
    private String requestID;
    private List<Step> steps = new ArrayList<>();

    public TripStatus() {

    }

    public TripStatus(String id, long acceptsAt, long requestsAt, long startsAt, long endsAt, String status, String driverID, String userID, String vehicleID, String vehicleType, String requestID, List<Step> steps) {
        this.id = id;
        this.acceptsAt = acceptsAt;
        this.requestsAt = requestsAt;
        this.startsAt = startsAt;
        this.endsAt = endsAt;
        this.status = status;
        this.driverID = driverID;
        this.userID = userID;
        this.vehicleID = vehicleID;
        this.vehicleType = vehicleType;
        this.requestID = requestID;
        this.steps = steps;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getAcceptsAt() {
        return acceptsAt;
    }

    public void setAcceptsAt(long acceptsAt) {
        this.acceptsAt = acceptsAt;
    }

    public long getRequestsAt() {
        return requestsAt;
    }

    public void setRequestsAt(long requestsAt) {
        this.requestsAt = requestsAt;
    }

    public long getStartsAt() {
        return startsAt;
    }

    public void setStartsAt(long startsAt) {
        this.startsAt = startsAt;
    }

    public long getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(long endsAt) {
        this.endsAt = endsAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }
}
