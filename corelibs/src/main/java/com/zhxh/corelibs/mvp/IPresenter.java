package com.zhxh.corelibs.mvp;

/**
 * @author zhxh
 * @date 2018/6/9 17:13
 * @desc
 */
public interface IPresenter<V extends IView> {

    /**
     * 绑定 View
     */
    void attachView(V mView);

    /**
     * 解除 View
     */
    void detachView();
}