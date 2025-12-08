package app.salmontt.ui;

import app.salmontt.data.GestorUnidades;
import app.salmontt.model.UnidadOperativa;

// Clase principal que ejecuta la aplicación
public class Main {
    public static void main(String[] args) {

        GestorUnidades gestor = new GestorUnidades();

        System.out.println("---------------------------");
        System.out.println("..::UNIDAD OPERATIVA::..");

        for (UnidadOperativa unidad : gestor.getUnidades()) {
            unidad.mostrarInformacion();
            System.out.println("---------------------------");
        }
    }
}