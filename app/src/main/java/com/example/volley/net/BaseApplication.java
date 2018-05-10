package com.example.volley.net;

import android.app.Application;
import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by ywh on skit.
 */
public class BaseApplication extends Application {

    private static Context mContext;
    private static RequestQueue queues;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        queues = Volley.newRequestQueue(mContext);
    }

    public static Context getContext() {
        return mContext;
    }

    public static RequestQueue getHttpQueues() {
        return queues;
    }
}
