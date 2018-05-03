package com.ini.mac.base;

/**
 * Created by ou on 2018/4/12/012.
 */
public class DemoResponse<T> {


    private String code;//消息类型
    private String message; //消息内容
    private String url;//请求的url


    private boolean hasException = false;//是否有错误信息

    private T data;//请求返回的数据



    public boolean isHasException() {
        return hasException;
    }

    public void setHasException(boolean hasException) {
        this.hasException = hasException;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
