/*
 * Copyright (c) 2020.
 * Author: Kayhan Swarup
 * Project: TestLibraries
 */

package com.kayhan.pages.models.references;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class UserReferences {

    public static DatabaseReference  getStatReference(String key){
        return FirebaseDatabase.getInstance().getReference("users").child(key).child("stat");
    }
    public static DatabaseReference getRequestReference(String key){
        return FirebaseDatabase.getInstance().getReference("users")
                .child(key)
                .child("requests")
                ;
    }
    public static DatabaseReference getRequestStatusReference(String key){
        return FirebaseDatabase.getInstance().getReference("users")
                .child(key)
                .child("requests")
                .child("status");

    }


}
