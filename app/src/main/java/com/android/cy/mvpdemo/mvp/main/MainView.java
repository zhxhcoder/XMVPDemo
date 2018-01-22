package com.android.cy.mvpdemo.mvp.main;

import com.android.cy.mvpdemo.mvp.other.BaseView;

public interface MainView extends BaseView {

    void getDataSuccess(MainModel model);

    void getDataFail(String msg);

}
