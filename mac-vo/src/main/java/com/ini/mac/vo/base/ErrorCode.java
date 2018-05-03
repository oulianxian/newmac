package com.ini.mac.vo.base;

/**
 * Created by ou on 2018/4/12/012.
 */
public enum ErrorCode {
    OBJECT_IS_NOT_FIND("OBJECT_IS_NOT_FIND","对象没有找到")
    ;
    private String errorCode;
    private String errorMsg;

     ErrorCode(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
