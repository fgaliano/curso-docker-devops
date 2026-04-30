package com.ejemplo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Random;

@Controller
public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo(Model model) {
        // 1. Generamos el número aleatorio (entre 0 y 999)
        int numeroAleatorio = new Random().nextInt(1000);

        // 2. Creamos el mensaje
        String mensajeCompleto = "Hola mundo desde mi primer microservicio galiano" + numeroAleatorio;

        // 3. Pasamos el mensaje al JSP usando el "modelo"
        model.addAttribute("textoParaLaVista", mensajeCompleto);

        // 4. Retornamos el nombre del archivo JSP (sin el .jsp)
        return "hola";
    }
}