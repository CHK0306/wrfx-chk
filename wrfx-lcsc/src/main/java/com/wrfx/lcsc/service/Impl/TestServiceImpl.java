package com.wrfx.lcsc.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wrfx.lcsc.Mapper.TestMapper;
import com.wrfx.lcsc.bean.dto.BaseProductDto;
import com.wrfx.lcsc.bean.vo.BaseProductVo;
import com.wrfx.lcsc.service.TestService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, BaseProductDto>
    implements TestService {

    @Override
    public void addTest(BaseProductVo baseProductVo) {
        save(baseProductVo);
    }
}




