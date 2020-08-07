package aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RecorderInvocationHandler implements InvocationHandler {

	private Recorder recorder;

	public RecorderInvocationHandler(Recorder recorder) {
		this.recorder = recorder;
	}

	/**
	 *
	 * @param proxy
	 * @param method 在生成的代理类中，通过反射获取目标类中的 method 对象
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 增强处理
		System.out.println("InvocationHandler before");
		//调用目标类方法
		method.invoke(recorder, args);
		System.out.println("InvocationHandler after");
		return null;
	}

}
