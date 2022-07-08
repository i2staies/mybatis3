package com.itguigu.mybatis.mapper;

import com.itguigu.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    /**
     * 通过分布查询查询员工以及员工所在部门信息
     * 分布查询第二步：通过did查询员工所对应的部门
     */
    Dept getEmpAndDeptByStepTwo(@Param("did") Integer did);

    /**
     * 获取部门以及部门中的所以员工信息
     */
    Dept getDeptAndEmp(@Param("did") Integer did);

    /**
     * 根据分布查询查询部门以及部门中所有员工的信息
     * 分布查询第一步
     */
    
}
