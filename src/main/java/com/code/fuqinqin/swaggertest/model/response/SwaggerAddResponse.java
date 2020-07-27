package com.code.fuqinqin.swaggertest.model.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @author fuqinqin3
 * @date 2020-07-27
 * */
@Data
public class SwaggerAddResponse implements Serializable {
    private Integer code;
    private String msg;
}
