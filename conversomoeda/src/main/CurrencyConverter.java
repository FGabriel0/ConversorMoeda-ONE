package main;

import java.util.Scanner;

public class CurrencyConverter {
    private final ExchangeRateService exchangeRateService;

    public CurrencyConverter(ExchangeRateService exchangeRateService) {
        this.exchangeRateService = exchangeRateService;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("==== Conversor de Moedas ====");
            System.out.println("Escolha uma opção de conversão:");
            System.out.println("1. USD para EUR");
            System.out.println("2. EUR para USD");
            System.out.println("3. USD para BRL");
            System.out.println("4. BRL para USD");
            System.out.println("5. EUR para BRL");
            System.out.println("6. BRL para EUR");
            System.out.println("7. Sair");
            System.out.print("Opção: ");
            int option = scanner.nextInt();

            if (option == 7) {
                System.out.println("Encerrando o programa...");
                break;
            }

            System.out.print("Informe o valor a ser convertido: ");
            double amount = scanner.nextDouble();
            String fromCurrency = getFromCurrency(option);
            String toCurrency = getToCurrency(option);

            try {
                double convertedAmount = exchangeRateService.convert(fromCurrency, toCurrency, amount);
                System.out.printf("Resultado: %.2f %s = %.2f %s%n", amount, fromCurrency, convertedAmount, toCurrency);
            } catch (Exception e) {
                System.out.println("Erro ao realizar a conversão: " + e.getMessage());
            }
        }
        scanner.close();
    }

    private String getFromCurrency(int option) {
        switch (option) {
            case 1:
            case 3:
                return "USD";
            case 2:
                return "EUR";
            case 4:
            case 6:
                return "BRL";
            case 5:
                return "EUR";
            default:
                return "";
        }
    }

    private String getToCurrency(int option) {
        switch (option) {
            case 1:
            case 5:
                return "EUR";
            case 2:
            case 4:
                return "USD";
            case 3:
            case 6:
                return "BRL";
            default:
                return "";
        }
    }
}
