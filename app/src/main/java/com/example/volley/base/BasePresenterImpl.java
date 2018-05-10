package com.example.volley.base;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public abstract class BasePresenterImpl<V extends BaseView> implements BasePresenter {

    protected V view;
    private final WeakReference<V> vWeakReference;
    protected BaseModel model;

    public BasePresenterImpl(BaseView view) {
        vWeakReference = (WeakReference<V>) new WeakReference<>(view);
        this.view = vWeakReference.get();
    }

    public void doNetWorkByVolley(int id) {
        Map<String, String> params = new HashMap<>();
        doNetWorkByVolley(id, params);
    }

    public abstract void doNetWorkByVolley(int id, Map<String, String> params);



}
