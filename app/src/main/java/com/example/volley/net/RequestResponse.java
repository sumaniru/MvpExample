package com.example.volley.net;

import com.android.volley.VolleyError;
import com.example.volley.base.BaseBean;

/**
 * Created by Administrator on 2017/1/19.
 */

public interface RequestResponse<T extends BaseBean> {
    void success(int id, T bean);

    void error(int id);
}
