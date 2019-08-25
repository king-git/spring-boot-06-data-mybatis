package com.caihao.springboot.mapper;

import com.caihao.springboot.bean.Dept;
import org.apache.ibatis.annotations.*;

/**
 * @author CaiHao
 * @create 2019-08-24 21:35:40
 */
//@mapper：指定这是一个操作数据库的mapper
//@Mapper
public interface DeptMapper {

    @Select("select * from dept where id = #{id}")
    public Dept getDeptById(Integer id);

    @Delete("delete from dept where id=#{id}")
    public int delDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")//封装主键信息
    @Insert("insert into dept(deptname) values(#{deptName})")
    public int insertDept(Dept dept);



    @Update("update dept set deptname = #{deptName} where id= #{id}")
    public  int updateDept(Dept dept);


}
