package example.wish.main.genarator;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@ComponentScan
@Component("wmg")
public class WishMassage {
	@Autowired
	public LocalDateTime ldt;
	
	
	public String Wishing(String name) {
		//Get Current Hour Day
		int hour=ldt.getHour();
		if(hour<12)
			return "Good morning My Dear:"+name;
		else if(hour<22)
			return "Good AfterNoon My Dear:"+name;
		else if (hour<20)
			return" Good Evening My Dear:"+name;
		else if(hour <22)
		    return"Good Night MY Dear:"+name;
		
		
		return name;
		
	}

}
