package com.example.volley.main.contact;

import com.example.volley.base.BasePresenter;
import com.example.volley.base.BaseView;
import com.example.volley.main.bean.WeatherBean;

public interface MainContact {

    interface View extends BaseView {
        void showWeather(WeatherBean bean);
    }

    interface Presenter extends BasePresenter {

    }

}
