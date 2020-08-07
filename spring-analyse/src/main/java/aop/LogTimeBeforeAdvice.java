package aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class LogTimeBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {

		System.out.println("LogTimeBeforeAdvice # before");
	}
}
