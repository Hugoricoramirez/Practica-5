package protesisock_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlertaController {

    @GetMapping("/alertas")
    public String obtenerAlertas() {
        return "Gestor de Alertas Protesisock: Sin incidencias criticas en el encaje.";
    }
}