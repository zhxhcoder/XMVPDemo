package com.zhxh.mvpdemo.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.zhxh.mvpdemo.R;
import com.zhxh.mvpdemo.mvp.main.MainModel;
import com.zhxh.mvpdemo.mvp.main.MainPresenter;
import com.zhxh.mvpdemo.mvp.main.MainView;
import com.zhxh.mvpdemo.mvp.other.MVPActivity;
import com.zhxh.mvpdemo.retrofit.ApiCallback;
import com.zhxh.mvpdemo.retrofit.RetrofitCallback;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;

public class MainActivity extends MVPActivity<MainPresenter> {

    @BindView(R.id.text)
    TextView text;


    private MainView mainView = new MainView() {
        @Override
        public void getDataSuccess(MainModel model) {
            //接口成功回调
            dataSuccess(model);
        }

        @Override
        public void getDataFail(String msg) {
            toastShow("网络不给力");
        }

        @Override
        public void showLoading() {
        }

        @Override
        public void hideLoading() {
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initToolBarAsHome("MVP+Retrofit+Rxjava");
    }

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter(mainView);
    }


    @OnClick({R.id.button0, R.id.button1, R.id.button2})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button0:
                loadDataByRetrofit();
                break;
            case R.id.button1:
                loadDataByRetrofitRxjava();
                break;
            case R.id.button2:
                //请求接口
                mvpPresenter.loadDataByRetrofitRxjava("101010100");
                break;
        }
    }

    private void loadDataByRetrofit() {
        showProgressDialog();
        Call<MainModel> call = apiStores().loadDataByRetrofit("101020100");
        call.enqueue(new RetrofitCallback<MainModel>() {
            @Override
            public void onSuccess(MainModel model) {
                dataSuccess(model);
            }

            @Override
            public void onFailure(int code, String msg) {
                toastShow(msg);
            }

            @Override
            public void onThrowable(Throwable t) {
                toastShow(t.getMessage());
            }

            @Override
            public void onFinish() {
                dismissProgressDialog();
            }
        });
        addCalls(call);
    }

    //全国+国外主要城市代码http://mobile.weather.com.cn/js/citylist.xml
    private void loadDataByRetrofitRxjava() {
        showProgressDialog();
        addSubscription(apiStores().loadDataByRetrofitRxjava("101280601"),
                new ApiCallback<MainModel>() {
                    @Override
                    public void onSuccess(MainModel model) {
                        dataSuccess(model);
                    }

                    @Override
                    public void onFailure(String msg) {
                        toastShow(msg);

                    }

                    @Override
                    public void onFinish() {
                        dismissProgressDialog();
                    }
                });
    }

    private void dataSuccess(MainModel model) {
        MainModel.WeatherinfoBean weatherinfo = model.getWeatherinfo();
        String showData = getResources().getString(R.string.city) + weatherinfo.getCity()
                + getResources().getString(R.string.wd) + weatherinfo.getWD()
                + getResources().getString(R.string.ws) + weatherinfo.getWS()
                + getResources().getString(R.string.sd) + weatherinfo.getSD()
                + getResources().getString(R.string.time) + weatherinfo.getTime();
        text.setText(showData);
    }
}
