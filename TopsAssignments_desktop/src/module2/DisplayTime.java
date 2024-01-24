package module2;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DisplayTime {

	public static void main(String[] args) {

		LocalTime sysTime = LocalTime.now();
		System.out.println("Current system time is [ " + sysTime + " ]");
		System.out.println();

		LocalDate sysDate = LocalDate.now();
		System.out.println("Current system date is [ " + sysDate + " ]");
		System.out.println();

		LocalDateTime sysDateTime = LocalDateTime.now();
		System.out.println("Current system date & time is [ " + sysDateTime + " ]");
		System.out.println();

		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy  hh-mm-ss");
		System.out.println("Current system date & time after formatting is [ " + sysDateTime.format(myFormat) + " ]");
	}

}
