package com.zhxh.mvpdemo.ui.main.mine;


import com.zhxh.corelibs.mvp.IModel;
import com.zhxh.corelibs.mvp.IView;
import com.zhxh.corelibs.net.BaseHttpResult;
import com.zhxh.mvpdemo.data.entity.TestNews;

import java.util.List;

import io.reactivex.Observable;

/**
 * @author zhxh
 * @date 2018/6/12 22:57
 * @desc 契约类
 */
public interface MineContract {


    interface View extends IView {

    }

    interface Model extends IModel {

    }

}
