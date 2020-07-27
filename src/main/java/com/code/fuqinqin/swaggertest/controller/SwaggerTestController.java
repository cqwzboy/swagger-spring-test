package com.code.fuqinqin.swaggertest.controller;

import com.code.fuqinqin.swaggertest.model.request.SwaggerAddRequest;
import com.code.fuqinqin.swaggertest.model.response.SwaggerAddResponse;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Swagger Controller 测试类
 *
 * @author fuqinqin3
 * @date 2020-07-27
 * */
@RestController
@RequestMapping("/swagger")
@Slf4j
public class SwaggerTestController {
    @PostMapping(value = "/add", produces = "application/json")
    @ApiOperation(value = "添加操作", notes = "添加行为操作", tags = "SwaggerTag", httpMethod = "POST")
    /*@ApiImplicitParams({
            @ApiImplicitParam(name = "SwaggerAddRequest", value = "SwaggerAddRequest", required = true, dataType = "com.code.fuqinqin.swaggertest.model.request.SwaggerAddRequest"),
            @ApiImplicitParam(name = "name", value = "名称", required = true, dataType = "String"),
            @ApiImplicitParam(name = "birthday", value = "生日", required = true, dataType = "Date")
    })*/
    @ApiResponses({
            @ApiResponse(code = 200, message = "SUCCESS", response = SwaggerAddResponse.class)
    })
    public SwaggerAddResponse add(@RequestBody SwaggerAddRequest request){
        log.info("#235 swagger-add request={}", request);
        SwaggerAddResponse response = new SwaggerAddResponse();
        response.setCode(200);
        response.setMsg("SUCCESS");
        return response;
    }
}
