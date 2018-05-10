package com.example.volley.net;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.volley.base.BaseBean;
import com.example.volley.base.BaseModelImpl;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Map;

/**
 * Created by mac on 17/12/8.
 */

public class BaseRequest {


    public static void StringRequestPost(final Context mContext, final int id, final String url,
                                         String tag, final Map<String, String> params, final Class<? extends BaseBean> c,
                                         final BaseModelImpl.NetResponse vif) {
        BaseApplication.getHttpQueues().cancelAll(tag);
        StringRequest stringrequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Log.d("onResponse-->", mContext.getResources().getString(id) + "==>" + s);
                vif.success(id, s, c);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Log.e("onErrorResponse", mContext.getResources().getString(id) + "==>" + volleyError.toString());
                vif.error(id);
            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                return params;
            }
        };
        stringrequest.setTag(tag);
        BaseApplication.getHttpQueues().add(stringrequest);
    }

}
