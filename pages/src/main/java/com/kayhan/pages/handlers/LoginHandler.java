package com.kayhan.pages.handlers;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.kayhan.pages.interfaces.LoginListener;
import com.kayhan.pages.logs.L;
import com.kayhan.pages.ui.LoginActivity;

public class LoginHandler {
    private static LoginHandler instance=new LoginHandler();

    private LoginHandler(){

    }

    public static LoginHandler getInstance() {
        return instance;
    }
    private LoginListener listener;
    public void startLogin(Context context , LoginListener listener){
        if (FirebaseAuth.getInstance().getCurrentUser()==null) {
            this.listener = listener;
            context.startActivity(new Intent(context, LoginActivity.class));
        }else{
            L.i("Logged in already");
            Toast.makeText(context,"Logged in already",Toast.LENGTH_LONG).show();
        }

    }

    public Resources.Theme getTheme() {
        return theme;
    }


    private Resources.Theme theme=null;

    public void startLogin(Context context , LoginListener listener, Resources.Theme theme){
        this.theme  =theme;
        if (FirebaseAuth.getInstance().getCurrentUser()==null) {
            this.listener = listener;
            Intent intent =new Intent(context, LoginActivity.class);
            context.startActivity(intent);
        }else{
            L.i("Logged in already");
            Toast.makeText(context,"Logged in already",Toast.LENGTH_LONG).show();
        }

        }

    public LoginListener getListener() {
        return listener;
    }
}
