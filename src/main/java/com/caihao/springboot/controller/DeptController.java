package com.caihao.springboot.controller;

import com.caihao.springboot.bean.Dept;
import com.caihao.springboot.bean.Emp;
import com.caihao.springboot.mapper.DeptMapper;
import com.caihao.springboot.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CaiHao
 * @create 2019-08-24 21:47:18
 */
@RestController
public class DeptController {


    @Autowired
    private DeptMapper deptMapper;

    @Autowired
    private EmpMapper empMapper;


    @GetMapping("/dept/{id}")
    public Dept getDept(@PathVariable(value = "id",required = false) Integer id){

        return deptMapper.getDeptById(id);

    }



    @GetMapping("/dept")
    public Dept addDept(Dept dept){

        int dept1 = deptMapper.insertDept(dept);
        System.err.println("dept1======"+dept1);

        return dept;
    }


    @GetMapping("/emp/{id}")
    public Emp getEmp(@PathVariable(value = "id",required = false) Integer id){
        Emp emp = empMapper.getEmp(id);
        return emp;
    }



}
