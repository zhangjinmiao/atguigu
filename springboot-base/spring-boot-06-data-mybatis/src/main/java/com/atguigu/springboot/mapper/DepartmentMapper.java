package com.atguigu.springboot.mapper;


import com.atguigu.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

// 指定這是一個操作數據庫的Mapper
// @Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id") // 是否使用自動生成的主鍵
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}