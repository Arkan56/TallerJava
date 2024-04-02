import java.util.*;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<MiembroDeTripulacion> tripulacion = new ArrayList<>();

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar un nuevo Miembro de la Tripulación.");
            System.out.println("2. Imprimir el promedio del sueldo mensual de todos los miembros.");
            System.out.println("3. Imprimir la información de todos los miembros.");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccione el tipo de miembro:");
                    System.out.println("1. Ingeniero de Sistemas");
                    System.out.println("2. Navegante Espacial");
                    System.out.println("3. Negociador Estelar");
                    int tipoMiembro = scanner.nextInt();
                    scanner.nextLine();

                    MiembroDeTripulacion nuevoMiembro = null;
                    switch (tipoMiembro) {
                        case 1:
                            nuevoMiembro = agregarIngenieroDeSistemas(scanner);
                            break;
                        case 2:
                            nuevoMiembro = agregarNaveganteEspacial(scanner);
                            break;
                        case 3:
                            nuevoMiembro = agregarNegociadorEstelar(scanner);
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }

                    if (nuevoMiembro != null) {
                        tripulacion.add(nuevoMiembro);
                        System.out.println("Miembro agregado correctamente.");
                    }
                    break;

                case 2:
                    double promedioSueldo = calcularPromedioSueldo(tripulacion);
                    System.out.println("El promedio del sueldo mensual de todos los miembros es: " + promedioSueldo);
                    break;

                case 3:
                    System.out.println("Información de todos los miembros:");
                    for (MiembroDeTripulacion miembro : tripulacion) {
                        System.out.println(miembro);
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa.");
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public static IngenieroDeSistemas agregarIngenieroDeSistemas(Scanner scanner) {
        System.out.println("Ingrese el nombre del ingeniero:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el ID del ingeniero:");
        int id = scanner.nextInt();
        System.out.println("Ingrese la edad del ingeniero:");
        int edad = scanner.nextInt();
        System.out.println("Ingrese el número de dependientes del ingeniero:");
        int nDependientes = scanner.nextInt();
        System.out.println("Ingrese el rol del ingeniero:");
        char rol = scanner.next().charAt(0);
        System.out.println("Ingrese el salario por hora del ingeniero:");
        double salarioHoraM = scanner.nextDouble();
        System.out.println("Ingrese las horas trabajadas del ingeniero:");
        int horasTrab = scanner.nextInt();

        return new IngenieroDeSistemas(nombre, id, edad, nDependientes, rol, salarioHoraM, horasTrab);
    }

    public static NaveganteEspacial agregarNaveganteEspacial(Scanner scanner) {
        System.out.println("Ingrese el nombre del navegante:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el ID del navegante:");
        int id = scanner.nextInt();
        System.out.println("Ingrese la edad del navegante:");
        int edad = scanner.nextInt();
        System.out.println("Ingrese el número de dependientes del navegante:");
        int nDependientes = scanner.nextInt();
        System.out.println("Ingrese el rol del navegante:");
        char rol = scanner.next().charAt(0);
        System.out.println("Ingrese el salario anual del navegante:");
        int salarioAnual = scanner.nextInt();
        System.out.println("Ingrese los años de experiencia del navegante:");
        int aniosExp = scanner.nextInt();

        return new NaveganteEspacial(nombre, id, edad, nDependientes, rol, salarioAnual, aniosExp);
    }

    public static NegociadorEstelar agregarNegociadorEstelar(Scanner scanner) {
        System.out.println("Ingrese el nombre del negociador:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el ID del negociador:");
        int id = scanner.nextInt();
        System.out.println("Ingrese la edad del negociador:");
        int edad = scanner.nextInt();
        System.out.println("Ingrese el número de dependientes del negociador:");
        int nDependientes = scanner.nextInt();
        System.out.println("Ingrese el rol del negociador:");
        char rol = scanner.next().charAt(0);
        System.out.println("Ingrese el salario base del negociador:");
        double salarioBase = scanner.nextDouble();
        System.out.println("Ingrese la comisión del negociador:");
        double comision = scanner.nextDouble();
        System.out.println("Ingrese las ventas del negociador:");
        double ventas = scanner.nextDouble();

        return new NegociadorEstelar(nombre, id, edad, nDependientes, rol, salarioBase, comision, ventas);
    }

    public static double calcularPromedioSueldo(ArrayList<MiembroDeTripulacion> tripulacion) {
        if (tripulacion.isEmpty()) {
            return 0;
        }

        double totalSueldo = 0;
        int contador = 0;
        for (MiembroDeTripulacion miembro : tripulacion) {
            totalSueldo += miembro.calcularSueldoMensual();
            contador++;
        }

        return totalSueldo / contador;
    }
}

