package beans;

import org.springframework.beans.factory.FactoryBean;

/**
 * FactoryBean 的使用
 */
public class EggFactory implements FactoryBean<Egg> {

	@Override
	public Egg getObject() throws Exception {
		return new Egg();
	}

	@Override
	public Class<?> getObjectType() {
		return Egg.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
