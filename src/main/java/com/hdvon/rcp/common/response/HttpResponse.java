package com.hdvon.rcp.common.response;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Toby on 2017/6/26.
 */
public class HttpResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final String DEFAULT_CODE = ResponseCode.SUCCESS.getCode();

    private static final String DEFAULT_MESSAGE = ResponseCode.SUCCESS.getMessage();

    private String code;

    private String message;

    private Map<String, Object> data = new HashMap<String, Object>();

    public HttpResponse() {
        code = DEFAULT_CODE;
        message = DEFAULT_MESSAGE;
    }

    public void setCodeMessage(ResponseCode resp) {
        this.code = resp.getCode();
        this.message = resp.getMessage();
    }

    public void setCodeMessage(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

}
