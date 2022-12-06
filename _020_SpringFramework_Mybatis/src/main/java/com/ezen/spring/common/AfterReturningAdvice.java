package com.ezen.spring.common;

import org.aspectj.lang.JoinPoint;

import com.ezen.spring.vo.UserVO;

public class AfterReturningAdvice {
	// returnObj: 포인트컷 메소드가 종료될 때 반환해주는 반환 값.
	// 두 번쩨 인자인 Object를 -> 바인드 변수라고 한다. 메소드의 리턴 값을 자동으로 매핑해준다.
	// 리턴값이 어떤 값으로 나올지 모르기에 Object로 지정
	public void afterReturningMethod(JoinPoint jp, Object returnObj) {
		// String 타입으로 메소드 이름 받아오기
		String methodName = jp.getSignature().getName();
		if(returnObj instanceof UserVO) {
			UserVO user = (UserVO)returnObj;
			if(user.getId().equals("admin")) {
				System.out.println(user.getName()+"님이 로그인(admin) 함");
			}
		}
		
		System.out.println("[사후 처리]" + methodName + "() 리턴 값:" + returnObj.toString());
	}
}
