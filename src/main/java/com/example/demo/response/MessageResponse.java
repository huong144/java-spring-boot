package com.example.demo.response;

public class MessageResponse extends BaseResponse {
    private String message;

    public MessageResponse() {
        super();
    }

    public MessageResponse(String message) {
        this.message = message;
    }

    public MessageResponse(int status, String responseEntity) {
        super(status);
        this.message = responseEntity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
