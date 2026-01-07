package software.ulpgc.katas;

import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {

        var cargador = new CargadorDatos();
        List<Empleado> empleados = cargador.cargarDesdeCSV("src/main/resources/datos.csv");

        var generator = new HistogramGenerator();

        Histogram histDepto = generator.compute(empleados, empleado -> empleado.departamento());

        MainFrame mainFrame = new MainFrame();
        mainFrame.mostrarHistograma(histDepto);

    }
}
