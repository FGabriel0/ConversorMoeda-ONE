package main;

public class main {
	 public static void main(String[] args) {
	        ExchangeRateService exchangeRateService = new ExchangeRateService();
	        CurrencyConverter currencyConverter = new CurrencyConverter(exchangeRateService);
	        currencyConverter.start();
	    }
}
