package ValueProperty_Annotation;

import org.springframework.stereotype.Component;

@Component
public class Fortune implements IFortune{
	
	public String getFortune() {
		return "you are the best.";
	}
	
}