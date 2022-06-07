package com.congge.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.congge.demo.entity.Course;
import com.baomidou.mybatisplus.extension.service.IService;


public interface ICourseService extends IService<Course> {

    Page<Course> findPage(Page<Course> page, String name);

    void setPatientCourse(Integer courseId, Integer patientId);
}
