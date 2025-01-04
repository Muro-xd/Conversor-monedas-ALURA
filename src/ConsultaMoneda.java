import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public Moneda conversorMoneda(String base , String target){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/5a19fe696537f14a1a1ae693/pair/"+base+"/"+target);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try{
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("No se encontró está moneda " + e.getMessage());
        }

    }

}
