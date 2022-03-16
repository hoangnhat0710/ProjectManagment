package com.example.demo.api.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiReponse {
    private int code;
    private String message;
    private Object data;

    public ApiReponse(int code, String message) {
        this.code = code;
        this.message = message;
    }


}
