package com.zhxh.mvpdemo.ui.main.video;


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
public interface VideoContract {


    //对于经常使用的关于UI的方法可以定义到IView中,如显示隐藏进度条,和显示文字消息
    interface View extends IView {

    }

    interface Model extends IModel {

    }

}
