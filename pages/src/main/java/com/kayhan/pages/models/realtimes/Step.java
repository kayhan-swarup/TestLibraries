/*
 * Copyright (c) 2020.
 * Author: Kayhan Swarup
 * Project: TestLibraries
 */

package com.kayhan.pages.models.realtimes;

public class Step {
    private double latitude;
    private double longitude;
    private long checksOutAt;


    public Step() {
    }

    public Step(double latitude, double longitude, long checksOutAt) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.checksOutAt = checksOutAt;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public long getChecksOutAt() {
        return checksOutAt;
    }

    public void setChecksOutAt(long checksOutAt) {
        this.checksOutAt = checksOutAt;
    }
}
