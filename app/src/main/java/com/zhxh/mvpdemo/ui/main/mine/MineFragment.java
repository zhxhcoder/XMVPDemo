package com.zhxh.mvpdemo.ui.main.mine;

import android.os.Bundle;

import com.zhxh.corelibs.base.BaseFragment;
import com.zhxh.mvpdemo.R;


/**
 * @author zhxh
 * @date 2018/6/12 22:57
 * @desc 我的
 */
public class MineFragment extends BaseFragment<MinePresenter> {


    private String mTitle;

    public static MineFragment getInstance(String title) {
        MineFragment fragment = new MineFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        fragment.mTitle = title;
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_mine;
    }

    @Override
    protected MinePresenter createPresenter() {
        return new MinePresenter();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected boolean useEventBus() {
        return false;
    }

    @Override
    public void showError(String msg) {

    }
}
