package Skill4;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class pro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
        System.out.println("Parsed Date: " + date);

        LocalDateTime dt = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm:ss");
        String formattedDate = dt.format(formatter);

        System.out.println("Formatted Date: " + formattedDate);


	}

}
