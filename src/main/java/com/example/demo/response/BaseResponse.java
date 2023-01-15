package com.example.demo.response;

public class BaseResponse {
    private boolean status;

    public BaseResponse() {
        super();
    }

    public BaseResponse(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
