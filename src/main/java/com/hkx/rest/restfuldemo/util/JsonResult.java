package com.hkx.rest.restfuldemo.util;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JsonResult {
    private int code;
    private String msg;
    private Object data;

    public JsonResult(int code, String msg, Object data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }
    public static JsonResult error(String msg) {
        return new JsonResult(500, msg, null);
    }
    public static JsonResult error(String msg, Object data) {
        return new JsonResult(500, msg, null);
    }
    public static JsonResult success() {
        return new JsonResult(200, "success", null);
    }
    public static JsonResult success(Object data) {
        return new JsonResult(200, "success", null);
    }


}
