package com.zhxh.mvpdemo.ui.main;

import com.zhxh.corelibs.mvp.BaseModel;
import com.zhxh.corelibs.net.BaseHttpResult;
import com.zhxh.mvpdemo.data.entity.TestNews;
import com.zhxh.mvpdemo.data.repository.RetrofitUtils;

import java.util.List;

import io.reactivex.Observable;

/**
 * @author zhxh
 * @date 2018/6/13 13:58
 * @desc 对数据层进行操作（比如，是否需要缓存，调用不同 apiservce，外界无需知道内部怎么实现）
 */
public class MainModel extends BaseModel implements MainContract.Model{

    @Override
    public Observable<BaseHttpResult<List<TestNews>>> getGankData() {
        return RetrofitUtils.getHttpService().getTestData();
    }
}
