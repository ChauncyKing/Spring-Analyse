package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");

		// 使用 JDK 动态代理时，生成的代理类只能转成 接口类型，无法转换成代理的目标类，即只代理接口中的方法
		// 使用 CGLIB 代理时，生成的代理类可以代理目标类中的所有方法，可以转换成代理的目标类
		//Recorder recorder = (Recorder) context.getBean("fileRecorder");
		FileRecorder recorder = (FileRecorder) context.getBean("fileRecorder");
		recorder.save();
		recorder.test();
	}
}
