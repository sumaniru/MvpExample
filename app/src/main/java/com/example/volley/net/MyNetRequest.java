package com.example.volley.net;

import android.content.Context;

import com.example.volley.base.BaseBean;
import com.example.volley.base.BaseModelImpl;

import java.util.Map;


/**
 * Created by Administrator on 2017/1/19.
 */

public class MyNetRequest {

    private Context context = BaseApplication.getContext();

    public void requestPost(int id, String url, Map<String, String> params,
                            Class<? extends BaseBean> c, BaseModelImpl.NetResponse response) {
        BaseRequest.StringRequestPost(context, id, url, "volley" + id, params, c, response);
    }

}

//    public void requestGet(int id, String url, RequestResponse response) {
//        BaseRequest.StringRequestGet(context, id, url, "volley" + id, response);
//    }
//
//    public void PostByOkHttp(int id, String url, Map<String, String> params, RequestResponse response) {
//        BaseRequest.PostByOkhttp(id, url, params, response);
//    }
//
//    public void requestImg(String id, String url, int width, int height, ImageRequestResponse response) {
//        BaseRequest.GetBitmap(context, id, url, id, width, height, response);
//    }