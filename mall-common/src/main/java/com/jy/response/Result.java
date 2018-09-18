package com.jy.response;

import com.jy.constant.ResponseEnum;

import java.io.Serializable;
import java.util.List;

/**
 * 返回基类
 * @param <T>
 */
public class Result<T> {
    private int code;
    private String msg;
    private List<T> objs;//返回集合
    private T obj;//返回对象，区分集合避免繁琐操作

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

    public List<T> getObjs() {
        return objs;
    }

    public void setObjs(List<T> objs) {
        this.objs = objs;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
