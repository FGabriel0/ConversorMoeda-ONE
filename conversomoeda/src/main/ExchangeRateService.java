package main;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ExchangeRateService {
    private static final String API_KEY = "20a3c565cc72b71335b29d0f"; // Substitua pela sua chave de API
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/";

    public double convert(String fromCurrency, String toCurrency, double amount) throws Exception {
        String url = API_URL + API_KEY + "/pair/" + fromCurrency + "/" + toCurrency;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != 200) {
            throw new Exception("Erro na requisição à API: " + response.statusCode());
        }

        JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();
        double exchangeRate = jsonResponse.get("conversion_rate").getAsDouble();
        return amount * exchangeRate;
    }
}


