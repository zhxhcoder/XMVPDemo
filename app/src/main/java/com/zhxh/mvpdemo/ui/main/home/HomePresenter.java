package com.zhxh.mvpdemo.ui.main.home;


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
public class HomePresenter extends BasePresenter<HomeContract.Model,HomeContract.View> {
    @Override
    protected HomeContract.Model createModel() {
        return new HomeModel();
    }


    public void requestData(){
        getModel().getGankData()
                .compose(RxSchedulers.applySchedulers(getLifecycleProvider()))
                .subscribe(new BaseObserver<List<TestNews>>(getView()) {
                    @Override
                    public void onSuccess(BaseHttpResult<List<TestNews>> result) {
                        if (result != null) {
                            getView().showData(result.getData());
                        }
                    }

                    @Override
                    public void onFailure(String errMsg, boolean isNetError) {
                        getView().showError(errMsg);
                    }
                });
    }
}
