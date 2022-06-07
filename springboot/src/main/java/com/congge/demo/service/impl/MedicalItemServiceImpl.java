package com.congge.demo.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.congge.demo.entity.InPatient;
import com.congge.demo.entity.MedicalItem;
import com.congge.demo.mapper.InPatientMapper;
import com.congge.demo.mapper.MedicalItemMapper;
import com.congge.demo.service.IInPatientService;
import com.congge.demo.service.MedicalItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MedicalItemServiceImpl extends ServiceImpl<MedicalItemMapper, MedicalItem> implements MedicalItemService {

    @Resource
    private MedicalItemMapper medicalItemMapper;


    @Override
    public Page<MedicalItem> findPage(Page<MedicalItem> page, String name) {
        return medicalItemMapper.findPage(page,name);
    }

//    @Resource
//    private OutMapper outMapper;
//
//    @Override
//    public Page<Out> findPage(Page<Object> objectPage, String name) {
//        return outMapper.findpage(objectPage,name);
//    }
}