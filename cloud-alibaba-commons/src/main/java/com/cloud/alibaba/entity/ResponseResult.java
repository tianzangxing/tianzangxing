package com.cloud.alibaba.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kangkang
 * @create 2021/11/1 19:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseResult<T> {
    private Integer code;
    private String message;
    private T      data;

    public ResponseResult(Integer code, String message){
        this(code,message,null);
    }

}
