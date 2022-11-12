package beans.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans/app/config.xml");
		Test t=(Test) context.getBean("test");
		t.print();
		System.out.println(t.getNames());
		System.out.println(t.getRollNo());
	}
}
