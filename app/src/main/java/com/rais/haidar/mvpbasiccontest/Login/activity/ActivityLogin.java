package com.rais.haidar.mvpbasiccontest.Login.activity;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.rais.haidar.mvpbasiccontest.Login.presenter.LoginPresenter;
import com.rais.haidar.mvpbasiccontest.Login.view.LoginView;
import com.rais.haidar.mvpbasiccontest.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class ActivityLogin extends AppCompatActivity implements LoginView {

    @InjectView(R.id.edtPassword)
    TextInputEditText edtPassword;
    @InjectView(R.id.edtUsername)
    TextInputEditText edtUsername;
    @InjectView(R.id.btnLogin)
    Button btnLogin;

    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        presenter = new LoginPresenter();
        onAttachView();
    }

    @OnClick(R.id.btnLogin)
    public void onViewClicked() {
        presenter.Auth(edtUsername.getText().toString(), edtPassword.getText().toString());
    }

    @Override
    public void onAttachView() {

        presenter.onAttach(this);
        presenter.Auth(edtUsername.getText().toString(),edtPassword.getText().toString());

    }

    @Override
    public void onDetachView() {

    }

    @Override
    public void onError(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onSuccess(String username, String msg) {
        Toast.makeText(this,username+ "" +msg,Toast.LENGTH_LONG).show();

    }
}
