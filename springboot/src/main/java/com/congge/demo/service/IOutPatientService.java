package com.congge.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.congge.demo.entity.OutPatient;

public interface IOutPatientService extends IService<OutPatient> {
    Page<OutPatient> findPage(Page<OutPatient> page, String name);

//
//    Page<Out> findPage(Page<Object> objectPage, String name);
}