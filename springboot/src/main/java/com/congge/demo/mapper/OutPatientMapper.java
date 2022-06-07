package com.congge.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.congge.demo.entity.OutPatient;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @since 2022-03-03
 */
public interface OutPatientMapper extends BaseMapper<OutPatient> {
    Page<OutPatient> findPage(Page<OutPatient> page, String name);
//    Page<Out> findpage(Page<Out> page, String name);


//    Page<out> findPage(Page<out> page, @Param("name") String name);
////
//    void deletePatientCourse(@Param("courseId")Integer courseId, @Param("studentId") Integer patientId);
//
//    void setPatientCourse(@Param("courseId")Integer courseId, @Param("studentId") Integer patientId);

}