package com.ini.mac.base;

/**
 * Created by ou on 2018/4/12/012.
 */
public class MyException extends RuntimeException {
    private String errCode;

    public String getErrCode() {
        return errCode;
    }

    public MyException(ErrorCode code, Object... variables) {
        super(variables != null ? String.format(code.getErrorMsg(), variables):code.getErrorCode());
        this.errCode = code.getErrorCode();
    }
}
