package ValueProperty_Annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("fcoach")
public class FootballCoach {
	
	private IFortune ifortune;
	
	@Value("${name}")
	private String name;
	@Value("${e_mail}")
	private String e_mail;
	
	public FootballCoach() {
		System.out.println("Football Coach constructor : ");
		System.out.println("This is Value Annotation program using the properties file.");
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

	public String getE_mail() {
		return e_mail;
	}

	public String getName() {
		return name;
	}

}