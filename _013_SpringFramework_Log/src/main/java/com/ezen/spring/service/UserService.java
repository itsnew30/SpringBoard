package com.ezen.spring.service;

import com.ezen.spring.vo.UserVO;

public interface UserService {
	
	
	UserVO getUser(UserVO userVO);

	void join(UserVO joinUser);
	
}
