package com.congge.demo.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.congge.demo.entity.OutPatient;
import com.congge.demo.mapper.OutPatientMapper;
import com.congge.demo.service.IOutPatientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OutPatientServiceImpl extends ServiceImpl<OutPatientMapper, OutPatient> implements IOutPatientService {

    @Resource
    private OutPatientMapper outPatientMapper;

    @Override
    public Page<OutPatient> findPage(Page<OutPatient> page, String name) {
        return outPatientMapper.findPage(page,name);
    }

//    @Resource
//    private OutMapper outMapper;
//
//    @Override
//    public Page<Out> findPage(Page<Object> objectPage, String name) {
//        return outMapper.findpage(objectPage,name);
//    }
}