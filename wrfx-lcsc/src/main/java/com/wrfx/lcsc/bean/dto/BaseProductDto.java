package com.wrfx.lcsc.bean.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.context.annotation.Primary;

import java.util.Date;

@TableName("t_test_product")
@Data
public class BaseProductDto {

    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private int id;
    private String name;
    private boolean shelf;
    private int commercialOwnerId;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;
    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateDate;
    /**
     * 上架数量
     */
    private int productCount;
}
