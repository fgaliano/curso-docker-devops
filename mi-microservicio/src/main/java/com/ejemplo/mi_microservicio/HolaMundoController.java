package com.ejemplo.mi_microservicio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 1. Cambiamos RestController por Controller (para devolver vistas, no texto)
public class HolaMundoController {

    @GetMapping("/hola")
    public String hola(Model model) {
        // 2. Metemos el dato en el "saquito" (model) para que el JSP lo vea
        model.addAttribute("mensaje", "¡Hola mundo desde el controlador, usando un HooK!");
        model.addAttribute("numero", Math.random());

        // 3. Devolvemos el nombre del archivo JSP (sin .jsp)
        return "hola";
    }

    /**
     * Prueba documentacion
     */
    public void prueba() {
        // Añadimos una instrucción para que no esté vacío
        int suma = 1 + 1;
    }

}