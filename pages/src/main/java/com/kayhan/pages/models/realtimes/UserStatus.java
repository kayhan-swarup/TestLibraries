/*
 * Copyright (c) 2020.
 * Author: Kayhan Swarup
 * Project: TestLibraries
 */

package com.kayhan.pages.models.realtimes;

public class UserStatus {
    private String id;
    private long initializesAt;
    private String referencePath;
    private String status;
    NodeK nodeK;

    public UserStatus() {
    }

    public UserStatus(String id) {
        this.id = id;
    }

    public UserStatus(String id, String referencePath) {
        this.id = id;
        this.referencePath = referencePath;
    }

}
