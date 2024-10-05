package com.helloworld.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.helloworld.services.FipeService;


@RestController
public class FipeController {
    @Autowired
    private FipeService fipeService;

    @GetMapping("/consultarMarcas")
    public String consultarMarcas() {
        return fipeService.consultarMarcas();
    }
    // Endpoint para consultar modelos de uma marca específica
@GetMapping("/consultarModelos/{marca}")
public String consultarModelos(@PathVariable int marca) {
// Chama o método consultarModelos do serviço FipeService, passando a marca como parâmetro
return fipeService.consultarModelos(marca);
}
// Endpoint para consultar anos de um modelo específico de uma marca específica
@GetMapping("/consultarAnos/{marca}/{modelo}")
public String consultarAnos(@PathVariable int marca, @PathVariable int modelo) {
// Chama o método consultarAnos do serviço FipeService, passando a marca e o modelo como parâmetros
return fipeService.consultarAnos(marca, modelo);
}
// Endpoint para consultar o valor de um modelo específico de uma marca específica em um ano específico
@GetMapping("/consultarValor/{marca}/{modelo}/{ano}")
public String consultarValor(@PathVariable int marca, @PathVariable int modelo, @PathVariable String ano) {
// Chama o método consultarValor do serviço FipeService, passando a marca, o modelo e o ano como parâmetros
return fipeService.consultarValor(marca, modelo, ano);
}
}
    


