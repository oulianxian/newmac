package com.ini.mac.controller;


import com.ini.mac.vo.base.MacResponse;

/**
 * Created by ou on 2018/4/15/015.
 */
public class BaseController {
    MacResponse handelSuccess(Object data){
        MacResponse response = new MacResponse();
        response.setHasException(false);
        response.setCode("0");
        response.setData(data);
        return response;
    }
    MacResponse handelSuccess(){
        return handelSuccess(null);
    }
}
