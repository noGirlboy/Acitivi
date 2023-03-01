package com.zq.acitivi.utils;

import lombok.Data;

import java.io.Serializable;



/**
 * @BelongsProject: Acitivi
 * @BelongsPackage: com.zq.acitivi.utils
 * @Author: zhangqian
 * @CreateTime: 2023-03-01  15:39
 * @Description:
 * @Version: 1.0
 */

@Data
public class Result implements Serializable {

    private int code;
    private String msg;
    private Object data;

    public static Result succ(Object data) {
        return succ(200, "操作成功", data);
    }

    public static Result fail(String msg) {
        return fail(400, msg, null);
    }

    public static Result succ (int code, String msg, Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static Result fail (int code, String msg, Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
}
