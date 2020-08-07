package aop;

import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;
import java.util.Objects;

public class JdkProxyClient {

	public static void main(String[] args) {

		// 静态代理
		// FileRecorderProxy proxy = new FileRecorderProxy(new FileRecorder());
		// proxy.save();

		// JDK 动态代理
		// 1.创建目标类对象
		Recorder target = new FileRecorder();
		// 2.增强规则
		RecorderInvocationHandler handler = new RecorderInvocationHandler(target);
		// 3.生成代理类 (反射API)
		ClassLoader classLoader = target.getClass().getClassLoader();
		Class<?>[] interfaces = target.getClass().getInterfaces();
		Recorder proxy = (Recorder) Proxy.newProxyInstance(classLoader, interfaces, handler);
		proxy.save();

	}

}
