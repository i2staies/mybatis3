package com.itguigu.mybatis.mapper;

import com.itguigu.mybatis.pojo.Dept;
import com.itguigu.mybatis.pojo.Emp;
import com.itguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class DynamicSQLMapperTest {
    @Test
    public void testGetEmpByCondtion(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> emps = mapper.getEmpByCondtion(new Emp(null, "张三", 18, null, null));
        System.out.println(emps);
    }
}
