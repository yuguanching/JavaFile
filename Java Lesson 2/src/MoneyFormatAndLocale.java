import java.text.NumberFormat;
import java.util.Locale;

public class MoneyFormatAndLocale {

	
			
public static void main (String[] args )
{
	
	System.out.println("Taiwan as Location : ");
	NumberFormat moneyFormater2 = 
			NumberFormat.getCurrencyInstance(Locale.TAIWAN);
	
	System.out.println(moneyFormater2.format(19.8));
	System.out.println(moneyFormater2.format(19.81111));
	System.out.println(moneyFormater2.format(19.89999));
	System.out.println(moneyFormater2.format(19));
	
}
}
