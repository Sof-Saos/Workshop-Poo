import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int opcion;
        String placaConsola;
        String marcaConsola;
        String modeloConsola;

        //Creacion de objetos e instancias.
        Parqueadero parqueadero = new Parqueadero(7200);
        Carro carro1 = new Carro("MJO-765", "Honda", "2024 HR-V");
        Carro carro2 = new Carro("BRB-426", "Jeep", "Wrangler");
        Carro carro3 = new Carro("JSD-354", "Renault", "Twizy");
        Carro carro4 = new Carro("RGO-231", "Renault", "Twingo");
        Carro carro5 = new Carro("HTT-534", "Kia", "Picanto");
        Carro carro6 = new Carro("WEQ-532", "Ford", "Fiesta");
        Carro carro7 = new Carro("NHF-765", "Mazda", "3");
        Carro carro8 = new Carro("EXA-123", "Chevrolet", "Sail");

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al parqueadero Estacionando en las Nubes!");

        do {
            System.out.println("1. Ver parqueadero.");
            System.out.println("2. Parquear carros.");
            System.out.println("3. Retirar carro.");
            System.out.println("4. Cambiar tarifa (Opción de administrador).");
            System.out.println("0. Salir del programa.");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    parqueadero.mostrarParqueadero();
                    break;

                case 2:
                    System.out.println("Espacios disponibles: ");
                    parqueadero.mostrarParqueadero(); //Primero se muestra el parqueadero para que el usuario pueda ver los lugares disponibles
                    //Carros que se estacionaran correctamente
                    if (parqueadero.parquearCarro(carro1, 1, 3)) { parqueadero.cobrarPorTiempo(carro1, 3); }
                    if (parqueadero.parquearCarro(carro2, 3, 6)) { parqueadero.cobrarPorTiempo(carro2, 7); }
                    if (parqueadero.parquearCarro(carro3, 5, 10)) { parqueadero.cobrarPorTiempo(carro3, 1); }
                    if (parqueadero.parquearCarro(carro6, 4, 9)) { parqueadero.cobrarPorTiempo(carro6, 6); }
                    if (parqueadero.parquearCarro(carro7, 2, 6)) { parqueadero.cobrarPorTiempo(carro7, 3); }
                    if (parqueadero.parquearCarro(carro8, 6, 4)) { parqueadero.cobrarPorTiempo(carro8, 5); }


                    //Carros que no podra por que el espacio ya esta ocupado
                    if (parqueadero.parquearCarro(carro4, 1, 3)) { parqueadero.cobrarPorTiempo(carro4, 9); }
                    if (parqueadero.parquearCarro(carro5, 5, 10)) { parqueadero.cobrarPorTiempo(carro5, 2); }
                    break;

                case 3:
                    System.out.println("Ingrese la placa del auto a retirar");
                    String retiro = sc.nextLine();
                    parqueadero.retirarCarro(retiro);
                    break;

                case 4:
                    //Los carros que se estacionaron antes de cambiar la tarifa, se les habrá cobrado la tarifa anterior.
                    System.out.println("Ingrese la contraseña de verificación"); //La contraseña es 112233
                    int password = sc.nextInt();
                    sc.nextLine(); //Limpiamos el buffer
                    if (password == 112233) { //Hacemos la verificación de la contraseña
                        System.out.print("Ingrese la tarifa nueva: ");
                        double nuevaTarifa = sc.nextDouble();
                        parqueadero.setTarifaHora(nuevaTarifa); //Cambiamos la tarifa con el set
                    }
                case 0:
                    System.out.println("Gracias por utilizar el parqueadero Estacionando en las Nubes. Tenga un lindo día!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (opcion!=0);
    }
}
