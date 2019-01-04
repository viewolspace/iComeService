package com.icome.pojo.query;

/**
 * Created by lenovo on 2019/1/2.
 */
public class BaseQuery {

    private int pageIndex = 1;

    private int pageSize = 20;

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
