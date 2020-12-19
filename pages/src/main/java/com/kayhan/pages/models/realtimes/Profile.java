/*
 * Copyright (c) 2020.
 * Author: Kayhan Swarup
 * Project: TestLibraries
 */

package com.kayhan.pages.models.realtimes;

public class Profile {
    protected String uid;
    protected String displayName;
    protected String photoUrl;
    protected String phone;
    protected String stat;



    public Profile() {
    }

    public Profile(String uid, String displayName, String photoUrl, String phone, String stat) {
        this.uid = uid;
        this.displayName = displayName;
        this.photoUrl = photoUrl;
        this.phone = phone;
        this.stat = stat;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }
}
