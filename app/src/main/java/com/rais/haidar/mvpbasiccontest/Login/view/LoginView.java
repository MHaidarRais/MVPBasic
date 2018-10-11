package com.rais.haidar.mvpbasiccontest.Login.view;

import com.rais.haidar.mvpbasiccontest.Base.BaseView;

/**
 * Created by Hoidar on 10/10/18.
 */

public interface LoginView extends BaseView {
    void onError(String msg);

    void onSuccess(String username, String msg);
}
