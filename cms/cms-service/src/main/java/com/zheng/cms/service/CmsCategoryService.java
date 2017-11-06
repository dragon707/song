package com.zheng.cms.service;

import com.zheng.cms.dao.mapper.CmsCategoryMapper;

/**
 * Created by liusong on 2017/11/1.
 */
public interface CmsCategoryService extends BaseService<CmsCategoryMapper>{

    // 批量删除
    int deleteByPrimaryKeys(String ids);
}
