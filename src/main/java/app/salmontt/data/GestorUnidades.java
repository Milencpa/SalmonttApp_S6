package app.salmontt.data;

import java.util.ArrayList;
import java.util.List;
import app.salmontt.model.PlantaProceso;
import app.salmontt.model.UnidadOperativa;
import app.salmontt.model.CentroCultivo;

public class GestorUnidades {

  private List <UnidadOperativa> unidades;
    public GestorUnidades() {
        unidades = new ArrayList<>();
        unidades.add(new CentroCultivo("Centro Cultivo A", "Comuna 1", 5000));
        unidades.add(new CentroCultivo("Centro Cultivo B", "Comuna 2", 8000));

        unidades.add(new PlantaProceso("Planta Proceso C", "Comuna 3", "Alta"));
        unidades.add(new PlantaProceso("Planta Proceso D", "Comuna 4", "Media"));
        unidades.add(new PlantaProceso("Planta Proceso E", "Comuna 5", "Baja"));
    }

    public List<UnidadOperativa> getUnidades() {
        return unidades;
    }

    public void mostrarUnidades(){
        for (UnidadOperativa unidad : unidades) {
            unidad.mostrarInformacion();
            System.out.println("---------------------------");
        }
}
}
