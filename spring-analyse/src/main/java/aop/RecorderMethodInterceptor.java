package aop;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


public class RecorderMethodInterceptor implements MethodInterceptor {

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("intercept before");
		methodProxy.invokeSuper(obj, args);
		System.out.println("intercept after");
		return null;
	}
}
