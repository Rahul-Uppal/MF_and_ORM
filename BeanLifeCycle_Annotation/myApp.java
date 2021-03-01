package BeanLifeCycle_Annotation;

import java.io.Closeable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myApp {
	public static void main(String args[]) {
		
		//load the spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_BeanLifeCycleAnnotation.xml");
		
		System.out.println("Inside bean factory...");
		
		// retrieve bean/object from spring container
		football c1 = (football) context.getBean("fcoach");
		// call the methods
		System.out.println();
		//System.out.println(c1);
		System.out.println();
		
		// closing the resources
		((ClassPathXmlApplicationContext)context).close();
		
		
		
	}
}
