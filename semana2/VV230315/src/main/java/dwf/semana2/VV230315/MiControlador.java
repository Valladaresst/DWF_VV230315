package dwf.semana2.VV230315;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/datos")
public class MiControlador {
    @Autowired
    private MiServicio miServicio;

    @GetMapping
    public List<String> obtenerDatos() {
        return miServicio.obtenerDatos();
    }

    @PostMapping
    public String agregarDato(@RequestBody String nuevoDato) {
        miServicio.agregarDato(nuevoDato);
        return "Dato agregado correctamente: " + nuevoDato;
    }

    // Endpoint para actualizar un dato
    @PutMapping("/{id}")
    public String actualizarDato(@PathVariable int id, @RequestBody String datoActualizado) {
        miServicio.actualizarDato(id, datoActualizado);
        return "Dato actualizado correctamente: " + datoActualizado;
    }

    // Endpoint para eliminar un dato
    @DeleteMapping("/{id}")
    public String eliminarDato(@PathVariable int id) {
        miServicio.eliminarDato(id);
        return "Dato eliminado correctamente con ID: " + id;
    }
}
