package com.wrfx.chk.pojo.response;

/**
 * 错误返回结果
 */
public class ErrorResponse extends BaseResponse {

    public ErrorResponse() {
    }

    public ErrorResponse(int code, String message) {
        super(code, message);
    }
}
