package com.android.haibobo.haibobo.utils.NetworkRequestUtils;

/**
 * Created by lijingbo on 2017/11/28.
 */

public class BaseResponse {
    /**
     * 错误码
     */
    private int code;
    /**
     * 错误描述
     */
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
