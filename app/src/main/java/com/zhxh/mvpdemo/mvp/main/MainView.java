package com.zhxh.mvpdemo.mvp.main;

import com.zhxh.mvpdemo.mvp.other.BaseView;

public interface MainView extends BaseView {

    void getDataSuccess(MainModel model);

    void getDataFail(String msg);

}
