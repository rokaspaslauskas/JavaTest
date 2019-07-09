import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class data {

	public static void main(String[] args) {
		LocalDate siandien = LocalDate.now();
		
		System.out.println(siandien);
		
		LocalDateTime laikas = LocalDateTime.now();
		
		System.out.println(laikas);
		
		DateTimeFormatter formateris = DateTimeFormatter.ofPattern("yyyy MM dd");
		String formatuotaSiandien = siandien.format(formateris);
		
		System.out.println(formatuotaSiandien);
		
	}
	

}
