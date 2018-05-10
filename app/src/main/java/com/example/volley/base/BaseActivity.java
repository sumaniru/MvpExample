package com.example.volley.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements BaseView {

    protected P presenter;
    protected Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        presenter = initPresenter();
    }

    public abstract P initPresenter();

    @Override
    public void showProgress() {

    }

    @Override
    public void cancelProgress() {

    }
}
