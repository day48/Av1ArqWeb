package com.helloworld.services;



import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FipeService {
    private final RestTemplate restTemplate = new RestTemplate();

    private String consultarURL(String apiUrl) {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            return responseEntity.getBody();
        } else {
            return "Falha ao obter dados. Código de status: " + responseEntity.getStatusCode();
        }
    }

    public String consultarMarcas() {
        String apiUrl = "https://parallelum.com.br/fipe/api/v1/carros/marcas";
        return consultarURL(apiUrl);
    }

   



// Método público que consulta os modelos de uma marca específica na API FIPE
public String consultarModelos(int marca) {
// URL da API para consultar modelos de uma marca específica
String apiUrl = "https://parallelum.com.br/fipe/api/v1/carros/marcas/" + marca + "/modelos";
// Chama o método consultarURL com a URL da API e retorna a resposta
return consultarURL(apiUrl);
}
// Método público que consulta os anos de um modelo específico de uma marca específica na API FIPE
public String consultarAnos(int marca, int modelo) {
// URL da API para consultar anos de um modelo específico de uma marca específica
String apiUrl = "https://parallelum.com.br/fipe/api/v1/carros/marcas/" + marca + "/modelos/" + modelo + "/anos";
// Chama o método consultarURL com a URL da API e retorna a resposta
return consultarURL(apiUrl);
}
// Método público que consulta o valor de um modelo específico de uma marca específica em um ano específico na API FIPE
public String consultarValor(int marca, int modelo, String ano) {
// URL da API para consultar o valor de um modelo específico de uma marca específica em um ano específico
String apiUrl = "https://parallelum.com.br/fipe/api/v1/carros/marcas/" + marca + "/modelos/" + modelo + "/anos/" + ano;
// Chama o método consultarURL com a URL da API e retorna a resposta
return consultarURL(apiUrl);
}
}


    

