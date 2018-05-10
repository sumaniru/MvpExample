package com.example.volley.main.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.android.volley.VolleyError;
import com.example.volley.R;
import com.example.volley.base.BaseActivity;
import com.example.volley.main.bean.WeatherBean;
import com.example.volley.main.contact.MainContact;
import com.example.volley.main.presenter.MainPresenter;
import com.example.volley.net.MyNetRequest;
import com.example.volley.net.RequestResponse;
import com.example.volley.net.Url;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContact.View {

    private TextView tv_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewAndEvent();
    }

    @Override
    public MainPresenter initPresenter() {
        return new MainPresenter(this);
    }

    private void initViewAndEvent() {
        tv_content = findViewById(R.id.tv_content);

        findViewById(R.id.btn).setOnClickListener(onClickListener);
    }


    @Override
    public void showWeather(WeatherBean bean) {
        StringBuilder builder = new StringBuilder();
        builder.append("杭州实时温度为-->").append(bean.getData().getWendu()).append("摄氏度");
        tv_content.setText(builder.toString());
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn:
                    presenter.doNetWorkByVolley(R.string.get_city_weather);
                    break;
            }
        }
    };

}
