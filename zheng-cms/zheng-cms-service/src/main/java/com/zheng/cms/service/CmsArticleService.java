package com.zheng.cms.service;

import com.zheng.cms.dao.mapper.CmsArticleMapper;

/**
 * Created by liusong on 2017/11/1.
 */
public interface CmsArticleService extends BaseService<CmsArticleMapper> {

    // 批量删除
    int deleteByPrimaryKeys(String ids);
}
