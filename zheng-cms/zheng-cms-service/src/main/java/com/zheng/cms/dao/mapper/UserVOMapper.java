package com.zheng.cms.dao.mapper;

import com.zheng.cms.dao.model.UserVO;
import org.springframework.stereotype.Repository;

/**
 * 用户mapper
 * @author shuzheng
 * @date 2016年7月6日 下午6:05:54
 */
@Repository
public interface UserVOMapper extends UserMapper {

	UserVO selectUserWithBook(int id);
	
}