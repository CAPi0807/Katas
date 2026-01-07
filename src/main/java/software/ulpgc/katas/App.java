package software.ulpgc.katas;

import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {

        var cargador = new CargadorDatos();
        List<Empleado> empleados = cargador.cargarDesdeCSV("src/main/resources/datos.csv");


        System.out.println("-------Empleados-------");
        empleados.stream().forEach(
                empleado -> System.out.println(empleado)
        );

        System.out.println("-------Ventas solo-------");
        empleados.stream()
                .filter(empleado -> "Ventas".equalsIgnoreCase(empleado.departamento()))
                .forEach(System.out::println);

    }
}
