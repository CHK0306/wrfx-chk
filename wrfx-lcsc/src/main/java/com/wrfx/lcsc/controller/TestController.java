package com.wrfx.lcsc.controller;

import com.wrfx.chk.pojo.response.CommonResponse;
import com.wrfx.lcsc.bean.vo.BaseProductVo;
import com.wrfx.lcsc.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
@Api("测试接口")
@Slf4j
public class TestController {

    @Resource
    private TestService testServiceImpl;

    @PostMapping("/addTest")
    @ApiOperation(value = "删除人脸",notes = "根据id进行删除")
    public CommonResponse<String> addTest(@RequestBody BaseProductVo baseProductVo){
        testServiceImpl.addTest(baseProductVo);
        return new CommonResponse<>("success");
    }
}
