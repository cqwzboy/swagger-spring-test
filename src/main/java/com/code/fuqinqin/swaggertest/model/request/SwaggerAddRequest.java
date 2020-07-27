package com.code.fuqinqin.swaggertest.model.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @author fuqinqin3
 * @date 2020-07-27
 * */
@Data
@ApiModel(value = "Swagger添加模型", description = "添加行为的请求模型")
public class SwaggerAddRequest implements Serializable {
    @ApiModelProperty(name = "id", value = "唯一标识", required = true, example = "1")
    private Integer id;
    @ApiModelProperty(name = "name", value = "名称", required = true, example = "张三")
    private String name;
    @ApiModelProperty(name = "birthday", value = "生日", required = true, example = "2020-07-27T10:48:00.000Z")
    private Date birthday;
}
