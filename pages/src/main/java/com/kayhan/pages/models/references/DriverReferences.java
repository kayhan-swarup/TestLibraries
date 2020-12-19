/*
 * Copyright (c) 2020.
 * Author: Kayhan Swarup
 * Project: TestLibraries
 */

package com.kayhan.pages.models.references;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DriverReferences {
    public static DatabaseReference getStatReference(String key){
        return FirebaseDatabase.getInstance().getReference("drivers").child(key).child("stat");
    }
    public static DatabaseReference getTripReference(String key){
        return FirebaseDatabase.getInstance().getReference("drivers")
                .child(key)
                .child("requests")
                ;
    }
    public static DatabaseReference getTripStatusReference(String key){
        return FirebaseDatabase.getInstance().getReference("trips")
                .child(key)
                .child("trips")
                .child("status");

    }
}
