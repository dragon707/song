package com.zheng.cms.dao.mapper;

import com.zheng.cms.dao.model.CmsCategoryTag;
import com.zheng.cms.dao.model.CmsCategoryTagExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsCategoryTagMapper {
    int countByExample(CmsCategoryTagExample example);

    int deleteByExample(CmsCategoryTagExample example);

    int deleteByPrimaryKey(Integer categoryTagId);

    int insert(CmsCategoryTag record);

    int insertSelective(CmsCategoryTag record);

    List<CmsCategoryTag> selectByExample(CmsCategoryTagExample example);

    CmsCategoryTag selectByPrimaryKey(Integer categoryTagId);

    int updateByExampleSelective(@Param("record") CmsCategoryTag record, @Param("example") CmsCategoryTagExample example);

    int updateByExample(@Param("record") CmsCategoryTag record, @Param("example") CmsCategoryTagExample example);

    int updateByPrimaryKeySelective(CmsCategoryTag record);

    int updateByPrimaryKey(CmsCategoryTag record);
}