/**
 * Copyright © 2015 fenlibao . All rights reserved.
 *
 * @Title: ErrorCode.java
 * @Prject: app-client-api-model
 * @Package: com.fenlibao.p2p.model.global
 * @Description: TODO
 * @author: laubrence
 * @date: 2015-10-26 上午9:53:18
 * @version: V1.0.0
 */
package com.hdvon.rcp.common.response;

/**
 * Created by Toby on 2017/6/26.
 */
public enum ResponseCode {
    SUCCESS("200", "请求成功"),
    FAILURE("500", "请求失败"),
    BAD_REQUEST("400", "请求参数不合法");

    private String code;

    private String message;

    ResponseCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

}
