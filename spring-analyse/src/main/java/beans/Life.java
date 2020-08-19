package beans;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

public class Life implements BeanNameAware, InitializingBean {

	@Override
	public void setBeanName(String name) {
		System.out.println("BeanNameAware");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean # afterPropertiesSet");
	}

	public void init() throws Exception {
		System.out.println("init()");
	}
}
