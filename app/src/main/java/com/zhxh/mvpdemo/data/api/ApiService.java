package com.zhxh.mvpdemo.data.api;

import com.zhxh.mvpdemo.data.entity.TestNews;
import com.zhxh.corelibs.net.BaseHttpResult;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * @author zhxh
 * @date 2018/6/11 23:04
 * @desc
 */
public interface ApiService {

    @GET("api/data/Android/10/1")
    Observable<BaseHttpResult<List<TestNews>>> getTestData();

}
