package com.kayhan.pages.interfaces;

import com.google.firebase.auth.FirebaseUser;

public interface LoginListener {

    void onLoggedIn(FirebaseUser firebaseUser);

}
