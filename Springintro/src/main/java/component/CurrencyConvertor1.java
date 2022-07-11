package component;


import org.springframework.stereotype.Component;

//with '@Component("currencyConv")' we create class of object instead '<bean>' line in '.xml' file
@Component("currencyConv") //alternative to <bean id="currencyConv" class="com.cdac.component.CurrencyConverter" />
public class CurrencyConvertor1 {

	public double convert(String from, String to, double amount) {
		if(from.equals("USD") && to.equals("INR"))
			return 78.98 * amount;
		else if(from.equals("GBP") && to.equals("INR"))
			return 94.41 * amount;
		else
			return 0; //rather we should throw exception
			//throw new CurrencyConverterException("Conversion of given currency not supported!");
	}
}

