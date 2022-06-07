package com.congge.demo.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.congge.demo.entity.Course;
import com.congge.demo.mapper.CourseMapper;
import com.congge.demo.service.ICourseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements ICourseService {

    @Resource
    private CourseMapper courseMapper;

    @Override
    public Page<Course> findPage(Page<Course> page, String name) {
        return courseMapper.findPage(page, name);
    }

    @Transactional
    @Override
    public void setPatientCourse(Integer courseId, Integer patientId) {
        courseMapper.deletePatientCourse(courseId, patientId);
        courseMapper.setPatientCourse(courseId, patientId);
    }

}

