package com.zheng.cms.service;

import com.zheng.cms.dao.mapper.CmsTagMapper;

/**
 * Created by liusong on 2017/11/1.
 */
public interface CmsTagService extends BaseService<CmsTagMapper>{

    // 批量删除
    int deleteByPrimaryKeys(String ids);
}
