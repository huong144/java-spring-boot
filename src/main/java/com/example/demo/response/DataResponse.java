package com.example.demo.response;

import java.util.List;

public class DataResponse<T> extends BaseResponse{

    private List<T> data;

    private long total;

    public DataResponse() {
        super();
    }

    public DataResponse(List<T> data, long total) {
        this.data = data;
        this.total = total;
    }

    public DataResponse(boolean status, List<T> data, long total) {
        super(status);
        this.data = data;
        this.total = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
