package com.ezen.spring.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;


@Service
// 3. 애즈펙트로 설정
@Aspect
public class BeforeAdvice {
	// 1. 포인트컷 설정
	/*
	@Pointcut("execution(* com.ezen.spring.service..*Impl.*(..))")
	public void allPointcut() {}
			
	@Pointcut("execution(* com.ezen.spring.service..*Impl.get*(..))")
	public void getPointcut() {}
	*/
	// 2. 어드바이스 설정
	// Pointcut을 외부클래스로 만들어주고, 그 포인트컷 불러와서 사용 가능
	// "allPointcut()" 시점에서 실행한
	@Before("PointcutCommon.allPointcut()") 
	public void beforeMethod(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		Object[] methodArgs = jp.getArgs();
		
		System.out.println("[사전 처리]" + methodName + "() 메소드 ARGS 정보: " + methodArgs[0].toString());
	}
}
