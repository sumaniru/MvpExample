package com.example.volley.main.model;

import com.example.volley.R;
import com.example.volley.base.BaseBean;
import com.example.volley.base.BaseModel;
import com.example.volley.base.BaseModelImpl;
import com.example.volley.main.bean.WeatherBean;
import com.example.volley.net.RequestResponse;
import com.example.volley.net.Url;
import com.google.gson.Gson;

import java.util.Map;

public class MainModel extends BaseModelImpl {


    public MainModel(RequestResponse response) {
        super(response);
    }

    @Override
    public void doNetWorkByVolley(int id, Map<String, String> params, Class<? extends BaseBean> c) {
        switch (id) {
            case R.string.get_city_weather:
                request.requestPost(id, Url.get_city_weather, params, c, netResponse);
                break;
        }
    }

}
