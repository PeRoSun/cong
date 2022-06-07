package com.congge.demo.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.congge.demo.entity.Course;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @since 2022-03-03
 */
public interface CourseMapper extends BaseMapper<Course> {

    Page<Course> findPage(Page<Course> page, @Param("name") String name);

    void deletePatientCourse(@Param("courseId")Integer courseId, @Param("studentId") Integer patientId);

    void setPatientCourse(@Param("courseId")Integer courseId, @Param("studentId") Integer patientId);

}