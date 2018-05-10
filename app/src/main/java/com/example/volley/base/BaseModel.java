package com.example.volley.base;


import com.example.volley.net.RequestResponse;

import java.util.Map;

public interface BaseModel {

    void doNetWorkByVolley(int id, Map<String, String> paramsm, Class<? extends BaseBean> c);


}
