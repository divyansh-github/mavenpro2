package in.gl.spframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Message m = (Message) context.getBean("messageService");
		System.out.println("Result: "+m.toString());
	}

}
