package com.itguigu.mybatis.mapper;

import com.itguigu.mybatis.pojo.Emp;

import java.util.List;

public interface DynamicSQLMapper {
    /**
     * 多条件查询
     */
    List<Emp> getEmpByCondtion(Emp emp);
}
