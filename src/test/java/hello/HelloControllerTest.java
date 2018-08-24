package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;
import org.joda.time.LocalTime;
import org.joda.time.LocalDate;

import org.junit.Test;

public class HelloControllerTest {

	private HelloController controller = new HelloController();

	@Test
	public void greeterSaysHello() {
		
		LocalTime currentTime = new LocalTime();
		LocalDate localDate = new LocalDate();		
		
		String minutes = "0" + currentTime.getMinuteOfHour();		
		if(minutes.length() != 2)
			minutes = minutes.substring(1,3);	
		
		int hour = currentTime.getHourOfDay();
		System.out.println(localDate);
		
		String complete = localDate + " " + hour + "h" + minutes;
		
		assertThat((controller.dateAndTime()), containsString(complete));
	}

}

