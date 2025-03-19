package com.ApiCep.LocalCep.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
class CepController {
    private final String VIA_CEP_URL = "https://viacep.com.br/ws/";

    @GetMapping("/buscar")
    public String buscarCep(@RequestParam String cep) {
        RestTemplate restTemplate = new RestTemplate();
        String url = VIA_CEP_URL + cep + "/json/";
        return restTemplate.getForObject(url, String.class);
    }
}