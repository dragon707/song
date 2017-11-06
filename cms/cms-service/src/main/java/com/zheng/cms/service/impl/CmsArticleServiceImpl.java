package com.zheng.cms.service.impl;

import com.zheng.cms.dao.mapper.CmsArticleMapper;
import com.zheng.cms.service.CmsArticleService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by liusong on 2017/11/1.
 */
@Service
@Transactional
public class CmsArticleServiceImpl implements CmsArticleService {

    private static Logger _log = LoggerFactory.getLogger(CmsArticleServiceImpl.class);

    @Autowired
    private CmsArticleMapper cmsArticleMapper;

    @Override
    public CmsArticleMapper getMapper() {
        return cmsArticleMapper;
    }

    @Override
    public int deleteByPrimaryKeys(String ids) {
        if(StringUtils.isBlank(ids)){
            return 0;
        }
        String[] idArray = ids.split("-");
        int count = 0;
        for(String id: idArray){
            if(StringUtils.isBlank(id)){
                continue;
            }
            try{
                count+=cmsArticleMapper.deleteByPrimaryKey(Integer.parseInt(id));
            }catch(Exception e){
                e.printStackTrace();
                return 0;
            }
        }
        return count;
    }
}
