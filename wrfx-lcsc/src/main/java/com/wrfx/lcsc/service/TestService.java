package com.wrfx.lcsc.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.wrfx.lcsc.bean.dto.BaseProductDto;
import com.wrfx.lcsc.bean.vo.BaseProductVo;

public interface TestService extends IService<BaseProductDto> {

    void addTest(BaseProductVo baseProductVo);
}
