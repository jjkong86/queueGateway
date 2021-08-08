package com.example.queuegateway.constant;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum Constant {
    CODE_SUCCESS(200);

    private int code;

    Constant(int code) {
        this.code = code;
    }

}
