package es.uma.Practica_5.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class ControlerHugo {
    
    @GetMapping("/sensores")
    public String infoSensores(){
        return """
        Lecturas actuales -> 
        Presión: 35 kpa
        Temperatura: 36.4 ºC
        Humedad: 52%
        """;
    }

}
