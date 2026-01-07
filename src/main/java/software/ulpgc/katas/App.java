package software.ulpgc.katas;

import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {

        var cargador = new CargadorDatos();
        List<Empleado> empleados = cargador.cargarDesdeCSV("src/main/resources/datos.csv");


        var generator = new HistogramGenerator();

        Histogram histDepto = generator.compute(empleados, Empleado::departamento);

        System.out.println("---Histograma Departamento---");
        for (String key : histDepto.keys()) {
            System.out.println(key + ": " + histDepto.valueOf(key));
        }

        Histogram histEdad = generator.compute(empleados, e -> e.edad());
        System.out.println("---Histograma Edades (décadas)---");
        for (String key : histEdad.keys()) {
            System.out.println(key + ": " + histEdad.valueOf(key));
        }

    }
}
