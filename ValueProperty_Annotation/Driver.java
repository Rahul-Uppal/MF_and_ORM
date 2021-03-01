package ValueProperty_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

	
public class Driver 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring_ValuePropertyAnnotation.xml");
    	
    	FootballCoach football=(FootballCoach) context.getBean("fcoach");
    	System.out.println("Value setted using Value Annotation tag and config file is : ");
    	System.out.println("Team Name : "+football.getName());
    	System.out.println("Position : "+football.getE_mail());
    	System.out.println(football.getDailyWorkout());
    	System.out.println(football.getDailyFortune());
    	
    	
    }
}