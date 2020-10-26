package com.example.vo;

import lombok.Data;

/**
 * @author zfc
 * @Package com.example.vo
 * @date 2020/10/26 16:56
 */
@Data
public class AjaxResultVO<T> {
    /**
     * 状态码，比如200代表响应成功
     */
    private int code;
    /**
     * 响应信息，用来说明响应情况
     */
    private String msg;
    /**
     * 响应的具体数据
     */
    private T data;

    public AjaxResultVO(T data) {
        this(200, "success", data);
    }

    public AjaxResultVO(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
