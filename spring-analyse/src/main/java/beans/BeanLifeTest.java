package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("init-beans.xml");
		Life life = (Life) context.getBean("life");
		System.out.println(life.toString());
	}

}
