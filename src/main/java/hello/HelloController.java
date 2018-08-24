package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.joda.time.LocalTime;
import org.joda.time.LocalDate;

@RestController
public class HelloController {

    @RequestMapping("/data")
   
   public String dateAndTime() {
		String minutes = "";
		LocalTime currentTime = new LocalTime();
		LocalDate localDate = new LocalDate();
		minutes = "0" + currentTime.getMinuteOfHour();
		if(minutes.length() != 2)
			minutes = minutes.substring(1,3);
		
        return localDate + " " + currentTime.getHourOfDay() + "h" + minutes;
    }
	
	
}