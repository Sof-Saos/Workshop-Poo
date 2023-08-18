import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    //Creamos dos ArrayList de yates y veleros que almacenaran todos las embarcaciones
    private static ArrayList<Velero> veleros = new ArrayList<>();
    private static ArrayList<Yate> yates = new ArrayList<>();

    public static void agregarYate(Yate yate) { yates.add(yate);}
    public static void agregarVelero(Velero velero) {
        veleros.add(velero);
    }

    public static void mostrarInfo() {
        int indice = 1;

        System.out.println("--------------- Informacion de Yates ------------");
        for (Yate yate : yates) {
            System.out.println(indice + ". Yate de: " + yate.eslora + " metros.");
            System.out.println("Fabricado en el año " + yate.fechaFabricacion);
            System.out.println("Con " + yate.getCantidadCamarotes() + " camarotes.");
            System.out.println("Su valor de alquiler es: " + yate.calcularMonto());
            System.out.println("Su valor de venta es: " + yate.calcularMontoCompraYate());
            yate.comprobarTamano();
            System.out.println(" ");
            indice++;
        }

        System.out.println(" ");
        System.out.println(" ");
        indice = 1; // Reinicia el contador de índices

        System.out.println("----------- Información de Veleros -------------");
        for (Velero velero : veleros) {
            System.out.println(indice + ". Velero de: " + velero.eslora + " metros.");
            System.out.println("Fabricado en el año " + velero.fechaFabricacion);
            System.out.println("Tiene " + velero.getCantidadMastiles() + " mastiles");
            System.out.println("Su valor de alquiler es: " + velero.calcularMonto());
            velero.comprobarTamano();
            System.out.println(" ");
            indice++;
        }
    }

    public static void main(String[] args) {
        //Definimos un capitan base que usaremos para crear las embarcaciones
        Capitan capitanBase = new Capitan("null", "null", "null");


        //Creamos las instancias de yate y velero
        Velero velero1 = new Velero(capitanBase, 2020, 79, 4);
        Velero velero2 = new Velero(capitanBase, 1999, 90, 6);
        Velero velero3 = new Velero(capitanBase, 2017, 37, 2);

        Yate yate1 = new Yate(capitanBase, 2019, 108, 8);
        Yate yate2 = new Yate(capitanBase, 2013, 156, 7);
        Yate yate3 = new Yate(capitanBase, 2023, 50, 2);
        Yate yate4 = new Yate(capitanBase, 2019, 78, 5);

        //Agregamos los yates y veleros a las listas:
        agregarYate(yate1);
        agregarYate(yate2);
        agregarYate(yate3);
        agregarYate(yate4);

        agregarVelero(velero1);
        agregarVelero(velero2);
        agregarVelero(velero3);

        //Definimos una variable que simulara la cantidad de dinero que tendrá el cliente
        double bill;

        System.out.println("Bienvenido a Makai, la empresa con la que puedes navegar tus sueños.");
        System.out.print("Ingrese la cantidad con la que cuenta para usar nuestros servicios: ");
        bill = sc.nextDouble();


        int opcion;
        boolean alquilerExitoso;
        boolean ventaExitosa;
        do {
            System.out.println("1. Ver informacion de las embarcaciones disponibles");
            System.out.println("2. Alquilar velero");
            System.out.println("3. Alquilar yate"); //Dado que los yates se pueden tanto alquilar como comprar, se definen dos opciones para yate
            System.out.println("4. Comprar yate");
            System.out.println("5. Ver saldo de cuenta actual"); //comprobar cuanto tiene en su bill
            System.out.println("6. Agregar más plata para comprar"); //Agregar más platica a su bill
            System.out.println("0. Salir del programa");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: //Ver todos los yates y veleros que hay disponibles para alquilar u comprar
                    mostrarInfo();
                    break;

                case 2:
                    System.out.print("Ingrese el indice del velero: ");
                    int veleroAlquilar = sc.nextInt();
                    switch (veleroAlquilar) {
                        case 1:
                            //Velero velero1 = new Velero(capitanBase, 2020, 79, 4)
                            alquilerExitoso = velero1.alquilar(bill);
                            if (alquilerExitoso) {
                                bill -= velero1.getPrecioBase();
                                veleros.remove(velero1);
                                System.out.println("Velero alquilado con éxito, su cuenta actual es: " + bill + " COP");
                            }
                            break;
                        case 2:
                            //Velero velero2 = new Velero(capitanBase, 1999, 90, 6)
                            alquilerExitoso = velero2.alquilar(bill);
                            if (alquilerExitoso) {
                                bill -= velero2.getPrecioBase();
                                veleros.remove(velero2);
                                System.out.println("Velero alquilado con éxito, su cuenta actual es: " + bill + " COP");
                            }
                            break;
                        case 3:
                            //Velero velero3 = new Velero(capitanBase, 2017, 37, 2)
                            alquilerExitoso = velero3.alquilar(bill);
                            if (alquilerExitoso) {
                                bill -= velero3.getPrecioBase();
                                veleros.remove(velero3);
                                System.out.println("Velero alquilado con éxito, su cuenta actual es: " + bill + " COP");
                            }
                            break;
                        default:
                            System.out.println("No hay ningun velero con ese indice");
                            break;
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el indice del yate: ");
                    int yateAlquilar = sc.nextInt();
                    switch (yateAlquilar) {
                        case 1:
                            //Yate yate1 = new Yate(capitanBase, 2019, 108, 8)
                            alquilerExitoso = yate1.alquilar(bill);
                            if (alquilerExitoso) {
                                bill -= yate1.getPrecioBase();
                                yates.remove(yate1);
                                System.out.println("Yate alquilado con éxito, su cuenta actual es: " + bill + " COP");
                            }
                            break;
                        case 2:
                            //Yate yate2 = new Yate(capitanBase, 2013, 156, 7)
                            alquilerExitoso = yate2.alquilar(bill);
                            if (alquilerExitoso) {
                                bill -= yate2.getPrecioBase();
                                yates.remove(yate2);
                                System.out.println("Yate alquilado con éxito, su cuenta actual es: " + bill + " COP");
                            }
                            break;
                        case 3:
                            //Yate yate3 = new Yate(capitanBase, 20231, 50, 2)
                            alquilerExitoso = yate3.alquilar(bill);
                            if (alquilerExitoso) {
                                bill -= yate3.getPrecioBase();
                                yates.remove(yate3);
                                System.out.println("Yate alquilado con éxito, su cuenta actual es: " + bill + " COP");
                            }
                        case 4:
                            //Yate yate4 = new Yate(capitanBase, 2019, 78, 5)
                            alquilerExitoso = yate4.alquilar(bill);
                            if (alquilerExitoso) {
                                bill -= yate4.getPrecioBase();
                                yates.remove(yate4);
                                System.out.println("Yate alquilado con éxito, su cuenta actual es: " + bill + " COP");
                            }
                            break;
                        default:
                            System.out.println("No hay ningun yate con ese indice");
                            break;
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el indice del yate: ");
                    int yateCompra = sc.nextInt();
                    switch (yateCompra) {
                        case 1:
                            //Yate yate1 = new Yate(capitanBase, 2019, 108, 8)
                            ventaExitosa = yate1.alquilar(bill);
                            if (ventaExitosa) {
                                bill -= yate1.calcularMontoCompraYate();
                                yates.remove(yate1);
                                System.out.println("Yate comprado con éxito, su cuenta actual es: " + bill + " COP");
                            }
                            break;
                        case 2:
                            //Yate yate2 = new Yate(capitanBase, 2013, 156, 7)
                            ventaExitosa = yate2.alquilar(bill);
                            if (ventaExitosa) {
                                bill -= yate2.calcularMontoCompraYate();
                                yates.remove(yate2);
                                System.out.println("Yate comprado con éxito, su cuenta actual es: " + bill + " COP");
                            }
                            break;
                        case 3:
                            //Yate yate3 = new Yate(capitanBase, 20231, 50, 2)
                            ventaExitosa = yate3.alquilar(bill);
                            if (ventaExitosa) {
                                bill -= yate3.calcularMontoCompraYate();
                                yates.remove(yate3);
                                System.out.println("Yate comprado con éxito, su cuenta actual es: " + bill + " COP");
                            }
                        case 4:
                            ventaExitosa = yate4.alquilar(bill);
                            if (ventaExitosa) {
                                bill -= yate4.calcularMontoCompraYate();
                                yates.remove(yate4);
                                System.out.println("Yate comprado con éxito, su cuenta actual es: " + bill + " COP");
                            }
                            break;
                        default:
                            System.out.println("No hay ningun yate con ese indice");
                            break;
                    }
                    break;

                case 5:
                    System.out.println("Su saldo es: " + bill);
                    break;
                case 6:
                    System.out.print("Ingrese el monto que desea añadir a su cuenta: ");
                    double cantidadAgregada = sc.nextDouble();
                    bill = cantidadAgregada + bill;
                    System.out.println("Saldo agregado correctamente, su saldo actual ahora es de: " + bill);
                    break;
                case 0:
                    System.out.println("Saliendo del programa");
                    break;
            }

        } while (opcion != 0);
    }


}
