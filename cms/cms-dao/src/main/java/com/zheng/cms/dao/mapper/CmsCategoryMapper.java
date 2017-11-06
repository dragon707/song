package com.zheng.cms.dao.mapper;

import com.zheng.cms.dao.model.CmsCategory;
import com.zheng.cms.dao.model.CmsCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsCategoryMapper {
    int countByExample(CmsCategoryExample example);

    int deleteByExample(CmsCategoryExample example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(CmsCategory record);

    int insertSelective(CmsCategory record);

    List<CmsCategory> selectByExample(CmsCategoryExample example);

    CmsCategory selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") CmsCategory record, @Param("example") CmsCategoryExample example);

    int updateByExample(@Param("record") CmsCategory record, @Param("example") CmsCategoryExample example);

    int updateByPrimaryKeySelective(CmsCategory record);

    int updateByPrimaryKey(CmsCategory record);
}