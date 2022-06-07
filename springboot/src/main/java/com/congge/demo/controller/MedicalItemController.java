package com.congge.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.congge.demo.common.Result;
import com.congge.demo.entity.MedicalItem;
import com.congge.demo.entity.OutPatient;
import com.congge.demo.service.IOutPatientService;
import com.congge.demo.service.MedicalItemService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/medicalItem")
public class MedicalItemController {

    @Resource
    private MedicalItemService medicalItemService;


    // 新增或者更新
    @PostMapping
    public Result save(@RequestBody MedicalItem medicalItem) {
        medicalItemService.saveOrUpdate(medicalItem);
        return Result.success();
    }

//    @PostMapping("/PatientCourse/{courseId}/{patientId}")
//    public Result PatientCourse(@PathVariable Integer courseId, @PathVariable Integer patientId) {
//        outService.setPatientCourse(courseId, patientId);
//        return Result.success();
//    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        medicalItemService.removeById(id);
        return Result.success();
    }

    @PostMapping("/del/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        medicalItemService.removeByIds(ids);
        return Result.success();
    }

    @GetMapping
    public Result findAll() {
        return Result.success(medicalItemService.list());
    }

    @GetMapping("/{id}")
    public Result findOne(@PathVariable Integer id) {
        return Result.success(medicalItemService.getById(id));
    }

    @GetMapping("/page")
    public Result findPage(@RequestParam String name,
                           @RequestParam Integer pageNum,
                           @RequestParam Integer pageSize) {
        Page<MedicalItem> page = medicalItemService.findPage(new Page<>(pageNum, pageSize), name);
        return Result.success(page);
    }

}