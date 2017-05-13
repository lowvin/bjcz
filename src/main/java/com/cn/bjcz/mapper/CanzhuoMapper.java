package com.cn.bjcz.mapper;

import com.cn.bjcz.pojo.Canzhuo;
import com.cn.bjcz.pojo.CanzhuoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CanzhuoMapper {
    int countByExample(CanzhuoExample example);

    int deleteByExample(CanzhuoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Canzhuo record);

    int insertSelective(Canzhuo record);

    List<Canzhuo> selectByExampleWithBLOBs(CanzhuoExample example);

    List<Canzhuo> selectByExample(CanzhuoExample example);

    Canzhuo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Canzhuo record, @Param("example") CanzhuoExample example);

    int updateByExampleWithBLOBs(@Param("record") Canzhuo record, @Param("example") CanzhuoExample example);

    int updateByExample(@Param("record") Canzhuo record, @Param("example") CanzhuoExample example);

    int updateByPrimaryKeySelective(Canzhuo record);

    int updateByPrimaryKeyWithBLOBs(Canzhuo record);

    int updateByPrimaryKey(Canzhuo record);
}