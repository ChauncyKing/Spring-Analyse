package aop;

import net.sf.cglib.proxy.Enhancer;

public class CglibProxyClient {

	public static void main(String[] args) {
		// CGLIB 代理
		// 1.字节码增强器
		Enhancer enhancer = new Enhancer();
		// 2.需要增强的父类
		enhancer.setSuperclass(FileRecorder.class);
		// 2.增强逻辑
		enhancer.setCallback(new RecorderMethodInterceptor());
		FileRecorder proxy = (FileRecorder) enhancer.create();
		proxy.save();
		proxy.test();
	}

}
