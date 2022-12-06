package com.ezen.spring.common;

public class AfterThrowingAdvice {
	public void afterThrowingMethod() {
		System.out.println("[예외 처리] 비즈니스 로직 예외 발생시 동작");
	}
}
