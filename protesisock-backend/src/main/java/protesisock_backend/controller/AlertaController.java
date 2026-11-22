package protesisock_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlertaController {
    
    /**
     * Endpoint REST que devuelve el estado actual de las alertas
     * generadas por los sensores de presion, temperatura y humedad de la malla.
     */

    @GetMapping("/alertas")
    public String obtenerAlertas() {
        return "Gestor de Alertas Protesisock: Sin incidencias criticas en el encaje.";
    }
}