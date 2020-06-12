package com.mapper;

import com.bean.Mybatisbean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-12 16:23
 */
@Mapper
public interface MybatisMapper {

    @Select("select * from role where rid = #{id}")
    public Mybatisbean selectByid(Integer id);


    public Mybatisbean selectByrname(String rname);
}
