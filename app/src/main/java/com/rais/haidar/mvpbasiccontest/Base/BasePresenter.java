package com.rais.haidar.mvpbasiccontest.Base;

/**
 * Created by Hoidar on 10/10/18.
 */

public interface BasePresenter<T extends BaseView> {
    void onAttach (T v);
    void onDettach();
}
