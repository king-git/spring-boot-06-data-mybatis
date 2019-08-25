package com.caihao.springboot.mapper;

import com.caihao.springboot.bean.Emp;

/**
 * @author CaiHao
 * @create 2019-08-25 09:55:00
 */
public interface EmpMapper {

    public Emp getEmp(Integer id);

    public int insertEmp(Emp emp);





}
