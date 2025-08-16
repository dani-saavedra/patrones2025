package co.edu.unisabana.patrones20252;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
    //Agregar la parte de Jenkins al parcial.
    private static final Logger log = LoggerFactory.getLogger(SaludoController.class);
    @Value("${POD_NAME:desconocido}")
    private String podName;

    @Value("${MENSAJE:desconocido}")
    private String mensaje;


    @GetMapping("/saludo")
    public String saludar() {
        DTO dto = new DTO("Daniel", 33);
        log.info("Gracias por tanto mundo");

        return "Hola" + mensaje + " mundo desde " + podName + dto;
        //return "Hola mundo desde " + podName + new DTO("Daniel", 33);
    }

    @GetMapping("/vaca")
    public String hacerVaca() {
        return "Buckhanas o miedo";
    }

    @GetMapping("/despido")
    public String despedirse() {
        return "Chao mundo";
    }
}
