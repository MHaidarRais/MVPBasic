package com.rais.haidar.mvpbasiccontest.Login.presenter;

import android.widget.BaseAdapter;

import com.rais.haidar.mvpbasiccontest.Base.BasePresenter;
import com.rais.haidar.mvpbasiccontest.Login.view.LoginView;

/**
 * Created by Hoidar on 10/10/18.
 */

public class LoginPresenter implements BasePresenter<LoginView> {

    LoginView loginView;

    public void Auth(String username, String password){

       if (!username.equals("")){
           if (!password.equals("")){
               if (password.length() >= 6){
                   loginView.onSuccess(username,"MASHUK PAK ECHO");
               }else {
                   loginView.onError("KURANG BANYAK PAK ECHO");
               }
           }else{
               loginView.onError("ISI PASSWORD NYA");
           }
       }else{
           loginView.onError("ISI USERNAME NYA");
       }

    }


    @Override
    public void onAttach(LoginView v) {
        loginView = v;

    }

    @Override
    public void onDettach() {
        loginView = null;
    }
}
