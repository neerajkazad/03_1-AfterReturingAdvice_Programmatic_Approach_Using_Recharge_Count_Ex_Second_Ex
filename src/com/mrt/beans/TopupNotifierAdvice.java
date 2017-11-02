package com.mrt.beans;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class TopupNotifierAdvice implements AfterReturningAdvice {

	public void afterReturning(Object ret, Method method, Object[] args,
			Object target) throws Throwable {
		String mobileNo = null;
		Float amount = null;
		mobileNo = (String)args[0];
		amount = (Float) args[1];
		System.out.println("199 full value topup is applicable on mobileNo "+mobileNo +" with topup "+amount);
	}

}
