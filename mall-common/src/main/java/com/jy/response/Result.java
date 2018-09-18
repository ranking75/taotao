package com.jy.response;

import com.jy.constant.ResponseEnum;

import java.io.Serializable;
import java.util.List;

public class Result<T> {
    private int code;
    private String msg;
    private List<T> obj;

    public void ok(){
        code = ResponseEnum.Response_Status_Ok.getCode();
        msg = ResponseEnum.Response_Status_Ok.getMsg();
    }

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

    public List<T> getObj() {
        return obj;
    }

    public void setObj(List<T> obj) {
        this.obj = obj;
    }
}
