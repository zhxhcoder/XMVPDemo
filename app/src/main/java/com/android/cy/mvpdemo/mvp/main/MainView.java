package com.android.cy.mvpdemo.mvp.main;

public interface MainView extends BaseView {

    void getDataSuccess(MainModel model);

    void getDataFail(String msg);

}
