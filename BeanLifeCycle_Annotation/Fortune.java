package BeanLifeCycle_Annotation;

import org.springframework.stereotype.Component;

import ValueProperty_Annotation.IFortune;

@Component
public class Fortune implements IFortune{
		
	public String getFortune() {
		return "you are the best.";
	}
		
}