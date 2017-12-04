package com.android.haibobo.haibobo.utils.NetworkRequestUtils;

import io.reactivex.disposables.Disposable;

/**
 * Created by lijingbo on 2017/11/28.
 */

public interface ISubscriber<T extends BaseResponse> {

    void doOnSubscribe(Disposable d);

    void doOnError(String errorMsg);

    void doOnNext(T t);

    void doOnCompleted();
}
