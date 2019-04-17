package com.zhxh.mvpdemo.ui.main;

import com.zhxh.corelibs.mvp.BasePresenter;
import com.zhxh.corelibs.net.BaseHttpResult;
import com.zhxh.corelibs.net.BaseObserver;
import com.zhxh.corelibs.rx.RxSchedulers;
import com.hazz.example.data.entity.TestNews;

import java.util.List;


/**
 * @author xuhao
 * @date 2018/6/12 16:18
 * @desc
 */
public class MainPresenter extends BasePresenter<MainContract.Model,MainContract.View>  {

    @Override
    protected MainContract.Model createModel() {
        return new MainModel();
    }

    public void requestData() {

    }



}
