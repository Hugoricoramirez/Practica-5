package protesisock_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/malla")
public class MallaController {

    @GetMapping
    public Map<String, Object> obtenerEstadoMalla() {
        return Map.of(
            "proyecto", "Malla Inteligente Protesisock",
            "estadoBluetooth", "Conectado",
            "bateria", "90%",
            "presion", "Normal",
            "temperatura", "36.4 C",
            "humedad", "44%",
            "ultimoMensaje", "Lectura correcta sin incidencias",
            "fechaHoraUltimoMensaje", "2026-11-22 20:15"
        );
    }
}