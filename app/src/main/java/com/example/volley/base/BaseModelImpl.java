package com.example.volley.base;

import com.example.volley.net.MyNetRequest;
import com.example.volley.net.RequestResponse;
import com.google.gson.Gson;

public abstract class BaseModelImpl implements BaseModel {

    protected MyNetRequest request;
    protected RequestResponse response;

    public BaseModelImpl(RequestResponse response) {
        request = new MyNetRequest();
        this.response = response;
    }

    public NetResponse netResponse = new NetResponse() {

        @Override
        public void success(int id, String s, Class<? extends BaseBean> c) {
            Gson gson = new Gson();
            response.success(id, gson.fromJson(s, c));
        }

        @Override
        public void error(int id) {

        }
    };

    public interface NetResponse {
        void success(int id, String s, Class<? extends BaseBean> c);

        void error(int id);
    }
}
