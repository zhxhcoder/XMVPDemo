package com.zhxh.mvpdemo.ui.main.video;


import com.zhxh.corelibs.mvp.BasePresenter;
import com.zhxh.corelibs.net.BaseHttpResult;
import com.zhxh.corelibs.net.BaseObserver;
import com.zhxh.corelibs.rx.RxSchedulers;
import com.zhxh.mvpdemo.data.entity.TestNews;

import java.util.List;

/**
 * @author zhxh
 * @date 2018/6/12 22:57
 * @desc
 */
public class VideoPresenter extends BasePresenter<VideoContract.Model,VideoContract.View> {
    @Override
    protected VideoContract.Model createModel() {
        return new VideoModel();
    }


    public void requestData(){

    }
}
