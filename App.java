/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        //CREACIÓN DE CONCESIONARIO
        Concesionario concesionario = new Concesionario("CarMotion");
    
        // Crear Vehiculo
        Vehiculo vehiculo1 = new Vehiculo("Mercedes", false, 2019, "Manuales", 107, "1.8L");
    
        Vehiculo vehiculo2 = new Vehiculo("Toyota", true, 2022, "Automático", 180, "2.0L");
        System.out.println("Detalles del Vehículo:\n");
        System.out.println(vehiculo1.toString());
        System.out.println(vehiculo2.toString());
        System.out.println();
    
        // Crear Buses
        Buses bus = new Buses("Mercedes-Benz", false, 2018, "Manual", 120, "6.0L", 50, 2, "2000L", 8);
        System.out.println("Detalles del Bus:");
        System.out.println(bus.toString());
        System.out.println();
    
        // Crear Vans
        Vans van = new Vans("Ford", true, 2023, "Automático", 160, "3.5L", 12, 4, "800L", 4);
        System.out.println("Detalles de la Van:");
        System.out.println(van.toString());
        }
    }
