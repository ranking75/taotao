package com.jy.response;

import com.jy.constant.ResponseEnum;

import java.io.Serializable;
import java.util.List;

public class QueryResult<T>extends Result<T> implements Serializable {
    private static final long serialVersionUID = -8545189623056485350L;
    private int page;
    private int count;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
