package com.alura.conversordemonedas.logica;

import com.alura.conversordemonedas.modelo.Moneda;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscarMoneda {
    public Moneda moneda (String baseCode, String targetCode) {
        URI url = URI.create("https://v6.exchangerate-api.com/v6/72c6b21c4def0bbf82d2c9b1/pair/"+baseCode+"/"+targetCode);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();

            String baseCodeApi = json.get("base_code").getAsString();
            String targetCodeApi = json.get("target_code").getAsString();
            double conversionRate = json.get("conversion_rate").getAsDouble();
            String timeLastApi = json.get("time_last_update_utc").getAsString();

            return new Moneda(baseCodeApi, targetCodeApi, conversionRate, timeLastApi);
        } catch (Exception e) {
            throw new RuntimeException("No se obtuvo el valor de la moneda" + e.getMessage());
        }
    }
}
