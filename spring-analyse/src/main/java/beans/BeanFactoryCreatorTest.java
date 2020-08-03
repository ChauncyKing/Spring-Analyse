package beans;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * 通过编程的方式 chu IOC 容器
 */
public class BeanFactoryCreatorTest {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("spring-beans.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);

		Chicken chicken = (Chicken) factory.getBean("chicken");
		Egg egg = (Egg) factory.getBean("egg");
		System.out.println(chicken.toString());
		System.out.println(egg.toString());
	}

}
