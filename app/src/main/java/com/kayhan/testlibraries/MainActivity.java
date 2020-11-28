package com.kayhan.testlibraries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.kayhan.pages.handlers.LoginHandler;
import com.kayhan.pages.interfaces.LoginListener;
import com.kayhan.pages.logs.L;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    public static final int LOGIN_UI=122;
    public static final int SEARCH_ITEMS=211;

    public int currentTest = LOGIN_UI;
    @Click({R.id.loginBtn})
    public void onLoginButtonClicked(View v){
        if(FirebaseAuth.getInstance().getCurrentUser()!=null){
            ((Button)v).setText("Login");
            FirebaseAuth.getInstance().signOut();
        }else{
            ((Button)v).setText("Log out");
            LoginHandler.getInstance()
                    .startLogin(v.getContext(), new LoginListener() {
                        @Override
                        public void onLoggedIn(FirebaseUser firebaseUser) {
                            if(firebaseUser!=null){
                                try {
                                    Toast.makeText(getBaseContext(),"Logged in: "+firebaseUser.getPhoneNumber(),Toast.LENGTH_LONG).show();
                                } catch (Exception e) {
                                    L.e(e);
                                }
                            }else{
                                Toast.makeText(getBaseContext(),"Login failed",Toast.LENGTH_LONG).show();
                            }
                        }
                    });
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginHandler.getInstance()
                .startLogin(this, new LoginListener() {
                    @Override
                    public void onLoggedIn(FirebaseUser firebaseUser) {
                        if(firebaseUser!=null){
                            try {
                                Toast.makeText(getBaseContext(),"Logged in: "+firebaseUser.getPhoneNumber(),Toast.LENGTH_LONG).show();
                            } catch (Exception e) {
                                L.e(e);
                            }
                        }else{
                            Toast.makeText(getBaseContext(),"Login failed",Toast.LENGTH_LONG).show();
                        }
                    }
                });


    }
}