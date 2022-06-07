package com.congge.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.congge.demo.common.Result;
import com.congge.demo.entity.InPatient;
import com.congge.demo.entity.OutPatient;
import com.congge.demo.service.IInPatientService;
import com.congge.demo.service.IOutPatientService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/inPatient")
public class InPatientController {

    @Resource
    private IInPatientService inService;


    // 新增或者更新
    @PostMapping
    public Result save(@RequestBody InPatient in) {
        inService.saveOrUpdate(in);
        return Result.success();
    }

//    @PostMapping("/PatientCourse/{courseId}/{patientId}")
//    public Result PatientCourse(@PathVariable Integer courseId, @PathVariable Integer patientId) {
//        outService.setPatientCourse(courseId, patientId);
//        return Result.success();
//    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        inService.removeById(id);
        return Result.success();
    }

    @PostMapping("/del/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        inService.removeByIds(ids);
        return Result.success();
    }

    @GetMapping
    public Result findAll() {
        return Result.success(inService.list());
    }

    @GetMapping("/{id}")
    public Result findOne(@PathVariable Integer id) {
        return Result.success(inService.getById(id));
    }

    @GetMapping("/page")
    public Result findPage(@RequestParam String name,
                           @RequestParam Integer pageNum,
                           @RequestParam Integer pageSize) {
        Page<InPatient> page = inService.findPage(new Page<>(pageNum, pageSize), name);
        return Result.success(page);
    }

}