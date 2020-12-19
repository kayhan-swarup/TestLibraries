/*
 * Copyright (c) 2020.
 * Author: Kayhan Swarup
 * Project: TestLibraries
 */

package com.kayhan.pages.models;

import com.kayhan.pages.models.realtimes.Profile;

public class Driver extends Profile {

    private String vehicleID;

    public Driver() {
        super();
    }


    public Driver(Profile u){
        super(u.getUid(),u.getDisplayName(), u.getPhotoUrl(),u.getPhone(),u.getStat());


    }



    public Driver(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public Driver(Profile u, String vehicleID){
        this(u);
        this.vehicleID = vehicleID;

    }


    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public Driver(String uid, String displayName, String photoUrl, String phone, String stat) {
        super(uid, displayName, photoUrl, phone, stat);
    }

    public Driver(String uid, String displayName, String photoUrl, String phone, String stat, String vehicleID) {
        super(uid, displayName, photoUrl, phone, stat);
        this.vehicleID = vehicleID;
    }


}
