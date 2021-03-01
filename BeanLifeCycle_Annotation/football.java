package BeanLifeCycle_Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ValueProperty_Annotation.IFortune;

@Component("fcoach")
@Scope("singleton")
public class football {
	
	private IFortune ifortune;
	
	public football() {
		System.out.println("Football Coach constructor : ");
		System.out.println("This is Bean life cycle program.");
	}
	
	public IFortune getIfortune() {
		return ifortune;
	}
	
	@Autowired
	public void setFootballFortune(IFortune ifortune) {
		System.out.println("");
		this.ifortune=ifortune;
	}
	
	public String getDailyWorkout() {
		return "lets do a practice match today!";
	}
	
	
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return ifortune.getFortune();
	}

	
	@PostConstruct
	public void start() {
		System.out.println("Inside the init method...");
	}
	
	@PreDestroy
	public void stop() {
		System.out.println("Inside the destroy method...");
	}
}
