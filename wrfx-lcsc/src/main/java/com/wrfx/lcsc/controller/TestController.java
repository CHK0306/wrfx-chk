package com.wrfx.lcsc.controller;

import com.wrfx.chk.pojo.response.CommonResponse;
import com.wrfx.chk.utils.JasyptUtils;
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


    @GetMapping("/encryptWithMD5")
    @ApiOperation(value = "解密测试",notes = "解密测试")
    public CommonResponse<String> encryptWithMD5(){
        String passwork = "wrfx_chk_passwork";
        System.out.println(JasyptUtils.encryptWithMD5("jdbc:mysql://localhost:3306/myTest?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8", passwork));
        System.out.println(JasyptUtils.encryptWithMD5("root", passwork));
        System.out.println(JasyptUtils.encryptWithMD5("chk@1234", passwork));
        System.out.println(JasyptUtils.encryptWithMD5("com.mysql.cj.jdbc.Driver", passwork));
        return new CommonResponse<>("success");
    }

    @GetMapping("/decryptWithMD5")
    @ApiOperation(value = "解密测试",notes = "解密测试")
    public CommonResponse<String> decryptWithMD5(){
        String passwork = "wrfx_chk_passwork";
        System.out.println(JasyptUtils.decryptWithMD5("uxh7eZpjSnp9tA6RefuyLKU9jzJ3AJDGoMY+9gX8lbfub+AA9LV1tdNwkQB4lFzj4sLmpvnIHu0u6VekcrCX2jaUCX9ERZW9NKs6SerWpXyDNxpX3KNHhrE/jv3XBsEhIMFzp5vwXxtPYQhM9Jv/SQ==", passwork));
        System.out.println(JasyptUtils.decryptWithMD5("SHrZQhaW04r+lQpLfE7tRg==", passwork));
        System.out.println(JasyptUtils.decryptWithMD5("sYVDJXgiTFHMnSdiXHi9LwghWJR0HlVQ", passwork));
        System.out.println(JasyptUtils.decryptWithMD5("q4gMZxhWLcT717zbCOpkKNYRFEt/PsheDlk3eTyoMubHRvuGrbTh9w==", passwork));
        return new CommonResponse<>("success");
    }
}
