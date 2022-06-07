package com.congge.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.congge.demo.entity.InPatient;
import com.congge.demo.entity.MedicalItem;

public interface MedicalItemService extends IService<MedicalItem> {


    Page<MedicalItem> findPage(Page<MedicalItem> page, String name);

//
//    Page<Out> findPage(Page<Object> objectPage, String name);
}