package com.example.demo.response;

public class ObjectResponse<T> extends BaseResponse {
    private T object;

    public ObjectResponse() {
        super();
    }

    public ObjectResponse(T object) {
        this.object = object;
    }

    public ObjectResponse(boolean status, T object) {
        super(status);
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
