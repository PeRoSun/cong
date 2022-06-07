package com.congge.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.congge.demo.entity.InPatient;
import com.congge.demo.entity.OutPatient;

public interface IInPatientService extends IService<InPatient> {


    Page<InPatient> findPage(Page<InPatient> page, String name);

//
//    Page<Out> findPage(Page<Object> objectPage, String name);
}