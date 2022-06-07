package com.congge.demo.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.congge.demo.entity.InPatient;
import com.congge.demo.entity.OutPatient;
import com.congge.demo.mapper.InPatientMapper;
import com.congge.demo.mapper.OutPatientMapper;
import com.congge.demo.service.IInPatientService;
import com.congge.demo.service.IOutPatientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class InPatientServiceImpl extends ServiceImpl<InPatientMapper, InPatient> implements IInPatientService {

    @Resource
    private InPatientMapper inPatientMapper;



    @Override
    public Page<InPatient> findPage(Page<InPatient> page, String name) {
        return inPatientMapper.findPage(page,name);
    }

//    @Resource
//    private OutMapper outMapper;
//
//    @Override
//    public Page<Out> findPage(Page<Object> objectPage, String name) {
//        return outMapper.findpage(objectPage,name);
//    }
}