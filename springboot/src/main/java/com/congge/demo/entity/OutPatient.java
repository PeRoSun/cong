package com.congge.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@ApiModel(value = "OutPatient对象", description = "")
public class OutPatient implements Serializable {

//    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("病人名称")
    private String patientId;

    @ApiModelProperty("科室名称")
    private String name;

    @ApiModelProperty("病房号")
    private Integer number;

    @ApiModelProperty("住院费用")
    private Integer pay;

    @ApiModelProperty("出院时间")
    private String times;

    @ApiModelProperty("病床号")
    private Integer bedId;

    @ApiModelProperty("接诊医生id")
    private Integer doctorId;

    @TableField(exist = false)
    private String doctor;


}
