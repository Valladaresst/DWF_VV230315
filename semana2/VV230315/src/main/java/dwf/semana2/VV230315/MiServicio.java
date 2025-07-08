package dwf.semana2.VV230315;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class MiServicio {

    private final List<String> datos = new ArrayList<>();

    public MiServicio() {
        // Datos iniciales
        datos.add("elemento1");
        datos.add("elemento2");
    }

    public List<String> obtenerDatos() {
        return datos;
    }

    public void agregarDato(String nuevoDato) {
        datos.add(nuevoDato);
    }

    // Método para actualizar un dato
    public void actualizarDato(int id, String datoActualizado) {
        if (id >= 0 && id < datos.size()) {
            datos.set(id, datoActualizado);
        } else {
            throw new IndexOutOfBoundsException("ID no válido: " + id);
        }
    }

    // Método para eliminar un dato
    public void eliminarDato(int id) {
        if (id >= 0 && id < datos.size()) {
            datos.remove(id);
        } else {
            throw new IndexOutOfBoundsException("ID no válido: " + id);
        }
    }
}
