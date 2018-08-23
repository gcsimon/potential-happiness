package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.joda.time.LocalTime;
import org.joda.time.LocalDate;

@RestController
public class HelloController {

    @RequestMapping("/data")
    public String index() {
		LocalTime currentTime = new LocalTime();
		LocalDate localDate = new LocalDate();
        return "Greetings from Spring Boot! " + localDate + " " + currentTime.getHourOfDay() + "h" + currentTime.getMinuteOfHour();
    }
	
	
	
	
	

}