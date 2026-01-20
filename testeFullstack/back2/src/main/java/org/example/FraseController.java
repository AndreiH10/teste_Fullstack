package org.example;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("/api")
public class FraseController {
    private final String[] frases = {
            "Java: Escreva uma vez, rode em qualquer lugar!",
            "Spring Boot facilita o desenvolvimento backend.",
            "A persistência é o caminho do êxito."
    };

    // O CrossOrigin é OBRIGATÓRIO para o Frontend conseguir ler os dados
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/frase")
    public Map<String, String> retornarFrase() {
        String selecionada = frases[new Random().nextInt(frases.length)];

        // O Java transforma este Map automaticamente em JSON {"mensagem": "..."}
        return Map.of("mensagem", selecionada);
    }
}
