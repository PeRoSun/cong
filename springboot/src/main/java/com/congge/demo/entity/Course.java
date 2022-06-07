package com.congge.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@ApiModel(value = "Course对象", description = "")
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("病人名称")
    private String patientId;

    @ApiModelProperty("科室名称")
    private String name;

    @ApiModelProperty("挂号")
    private Integer number;

    @ApiModelProperty("挂号时间")
    private String times;


    @ApiModelProperty("接诊医生id")
    private Integer doctorId;

    @TableField(exist = false)
    private String doctor;


}
