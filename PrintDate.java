import java.util.*;
import java.text.*;

/**
 * Print Date in specific format
 */
public class PrintDate {

	public static void main(String[] args) {

		String pattern = "MM-dd-yyyy";

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());

		System.out.println("Today's date -> " + date);
	}
}
