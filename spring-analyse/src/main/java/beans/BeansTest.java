package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");

		Chicken chicken = (Chicken) context.getBean("chicken");
		Egg egg = (Egg) context.getBean("egg");
		System.out.println(chicken.toString());
		System.out.println(egg.toString());

	}

}
