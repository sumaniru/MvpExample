package com.example.volley.main.presenter;

import android.content.Context;

import com.android.volley.VolleyError;
import com.example.volley.R;
import com.example.volley.base.BaseActivity;
import com.example.volley.base.BaseBean;
import com.example.volley.base.BasePresenterImpl;
import com.example.volley.base.BaseView;
import com.example.volley.main.bean.WeatherBean;
import com.example.volley.main.contact.MainContact;
import com.example.volley.main.model.MainModel;
import com.example.volley.net.RequestResponse;

import java.util.Map;

public class MainPresenter extends BasePresenterImpl<MainContact.View> implements MainContact.Presenter {

    private Context mContext;
    private AllListener allListener = new AllListener();

    public MainPresenter(MainContact.View view) {
        super(view);
        mContext = (Context) view;
        model = new MainModel(allListener);
    }


    @Override
    public void doNetWorkByVolley(int id, Map<String, String> params) {
        switch (id) {
            case R.string.get_city_weather:
                params.put("city", "杭州");
                model.doNetWorkByVolley(id, params, WeatherBean.class);
                break;
        }
    }

    private class AllListener implements RequestResponse {

        @Override
        public void success(int id, BaseBean bean) {
            switch (id) {
                case R.string.get_city_weather:
                    view.showWeather((WeatherBean) bean);
                    break;
            }
        }

        @Override
        public void error(int id) {

        }
    }

}
