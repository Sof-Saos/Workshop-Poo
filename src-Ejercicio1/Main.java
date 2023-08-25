import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Definimos atributos que usaremos en el main
        int opcion;
        boolean alquilerExitoso;
        boolean ventaExitosa;
        String nombreCap;
        String apellidoCap;
        String matricula;

        //Definimos un capitan base que usaremos para crear las embarcaciones
        Capitan capitan = new Capitan("null", "null", "null");

        //Creamos las instancias de yate y velero
        Velero velero1 = new Velero(capitan, 2020, 79, 4);
        Velero velero2 = new Velero(capitan, 1999, 90, 6);
        Velero velero3 = new Velero(capitan, 2017, 37, 2);

        Yate yate1 = new Yate(capitan, 2019, 108, 8);
        Yate yate2 = new Yate(capitan, 2013, 156, 7);
        Yate yate3 = new Yate(capitan, 2023, 50, 2);
        Yate yate4 = new Yate(capitan, 2019, 78, 5);

        //Agregamos los yates y veleros a las listas:
        Embarcacion.agregarYate(yate1);
        Embarcacion.agregarYate(yate2);
        Embarcacion.agregarYate(yate3);
        Embarcacion.agregarYate(yate4);

        Embarcacion.agregarVelero(velero1);
        Embarcacion.agregarVelero(velero2);
        Embarcacion.agregarVelero(velero3);

        //Definimos una variable que simulara la cantidad de dinero que tendrá el cliente
        double bill;

        System.out.println("Bienvenido a Makai, la empresa con la que puedes navegar tus sueños.");
        System.out.print("Ingrese la cantidad con la que cuenta para usar nuestros servicios: ");
        bill = sc.nextDouble(); //le pedimos el saldo de cuenta al usuario

        do {
            System.out.println("1. Ver informacion de las embarcaciones disponibles");
            System.out.println("2. Alquilar un velero");
            System.out.println("3. Alquilar un yate"); //Dado que los yates se pueden tanto alquilar como comprar, se definen dos opciones para yate
            System.out.println("4. Comprar un yate");
            System.out.println("5. Ver mis datos y saldo de cuenta"); //comprobar cuanto tiene en su bill
            System.out.println("6. Agregar más plata para comprar"); //Agregar más platica a su bill
            System.out.println("0. Salir del programa");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: //Ver todos los yates y veleros que hay disponibles para alquilar u comprar
                        Embarcacion.mostrarInfo();
                        break;
                case 2:  //Alquilar velero
                    sc.nextLine();
                    System.out.print("Ingrese su nombre: "); //Le pedimos al cliente sus datos para el alquiler de la embarcación
                    nombreCap = sc.nextLine();
                    System.out.print("Ingrese su apellido: ");
                    apellidoCap = sc.nextLine();
                    System.out.print("Ingrese su matricula de navegación: ");
                    matricula = sc.nextLine();
                    System.out.print("Ingrese el indice del velero (De la lista inicial): ");
                    int veleroAlquilar = sc.nextInt();
                    sc.nextLine();
                    switch (veleroAlquilar) {
                        case 1:
                            //Velero velero1 = new Velero(capitanBase, 2020, 79, 4)
                            alquilerExitoso = velero1.alquilar(bill);
                            if (alquilerExitoso) {
                                bill -= velero1.getPrecioBase(); //Restamos el valor del alquiler al saldo del cliente
                                Embarcacion.veleros.remove(velero1);
                                capitan.setNombre(nombreCap);
                                capitan.setApellido(apellidoCap);
                                capitan.setMatriculaNavegacion(matricula);
                                System.out.println("Velero alquilado con éxito, su cuenta actual es: " + bill + " COP");
                                System.out.println("Gracias por su compra Señor/a " + capitan.getNombre() + " " + capitan.getApellido());
                            }
                            break;
                        case 2:
                            //Velero velero2 = new Velero(capitanBase, 1999, 90, 6)
                            alquilerExitoso = velero2.alquilar(bill);
                            if (alquilerExitoso) {
                                bill -= velero2.getPrecioBase();
                                Embarcacion.veleros.remove(velero2);
                                capitan.setNombre(nombreCap);
                                capitan.setApellido(apellidoCap);
                                capitan.setMatriculaNavegacion(matricula);
                                System.out.println("Velero alquilado con éxito, su cuenta actual es: " + bill + " COP");
                                System.out.println("Gracias por su compra Señor/a " + capitan.getNombre() + " " + capitan.getApellido());
                            }
                            break;
                        case 3:
                            //Velero velero3 = new Velero(capitanBase, 2017, 37, 2)
                            alquilerExitoso = velero3.alquilar(bill);
                            if (alquilerExitoso) {
                                bill -= velero3.getPrecioBase();
                                Embarcacion.veleros.remove(velero3);
                                capitan.setNombre(nombreCap);
                                capitan.setApellido(apellidoCap);
                                capitan.setMatriculaNavegacion(matricula);
                                System.out.println("Velero alquilado con éxito, su cuenta actual es: " + bill + " COP");
                                System.out.println("Gracias por su compra Señor/a " + capitan.getNombre() + " " + capitan.getApellido());
                            }
                            break;
                        default:
                            System.out.println("No hay ningun velero con ese indice");
                            break;
                    }
                    break;
                case 3 :  //Alquilar yates
                    sc.nextLine(); //Limpiamos el buffer
                    System.out.print("Ingrese su nombre: "); //Le pedimos al cliente sus datos para el alquiler de la embarcación
                    nombreCap = sc.nextLine();
                    System.out.print("Ingrese su apellido: ");
                    apellidoCap = sc.nextLine();
                    System.out.print("Ingrese su matricula de navegación: ");
                    matricula = sc.nextLine();
                    System.out.print("Ingrese el indice del yate (De la lista inicial): ");
                    int yateAlquilar = sc.nextInt();
                    sc.nextLine(); //Limpiamos el buffer
                    switch (yateAlquilar) {
                        case 1:
                            //Yate yate1 = new Yate(capitanBase, 2019, 108, 8)
                            alquilerExitoso = yate1.alquilar(bill);
                            if (alquilerExitoso) {
                                bill -= yate1.getPrecioBase(); //Restamos el valor del alquiler al saldo del cliente
                                Embarcacion.yates.remove(yate1);
                                capitan.setNombre(nombreCap);
                                capitan.setApellido(apellidoCap);
                                capitan.setMatriculaNavegacion(matricula);
                                System.out.println("Yate alquilado con éxito, su cuenta actual es: " + bill + " COP");
                                System.out.println("Gracias por su compra Señor/a " + capitan.getNombre() + " " + capitan.getApellido());
                            }
                            break;
                        case 2:
                            //Yate yate2 = new Yate(capitanBase, 2013, 156, 7)
                            alquilerExitoso = yate2.alquilar(bill);
                            if (alquilerExitoso) {
                                bill -= yate2.getPrecioBase();
                                Embarcacion.yates.remove(yate2);
                                capitan.setNombre(nombreCap);
                                capitan.setApellido(apellidoCap);
                                capitan.setMatriculaNavegacion(matricula);
                                System.out.println("Yate alquilado con éxito, su cuenta actual es: " + bill + " COP");
                                System.out.println("Gracias por su compra Señor/a " + capitan.getNombre() + " " + capitan.getApellido());
                            }
                            break;
                        case 3:
                            //Yate yate3 = new Yate(capitanBase, 20231, 50, 2)
                            alquilerExitoso = yate3.alquilar(bill);
                            if (alquilerExitoso) {
                                bill -= yate3.getPrecioBase();
                                Embarcacion.yates.remove(yate3);
                                capitan.setNombre(nombreCap);
                                capitan.setApellido(apellidoCap);
                                capitan.setMatriculaNavegacion(matricula);
                                System.out.println("Yate alquilado con éxito, su cuenta actual es: " + bill + " COP");
                                System.out.println("Gracias por su compra Señor/a " + capitan.getNombre() + " " + capitan.getApellido());
                            }
                        case 4:
                            //Yate yate4 = new Yate(capitanBase, 2019, 78, 5)
                            alquilerExitoso = yate4.alquilar(bill);
                            if (alquilerExitoso) {
                                bill -= yate4.getPrecioBase();
                                Embarcacion.yates.remove(yate4);
                                capitan.setNombre(nombreCap);
                                capitan.setApellido(apellidoCap);
                                capitan.setMatriculaNavegacion(matricula);
                                System.out.println("Yate alquilado con éxito, su cuenta actual es: " + bill + " COP");
                                System.out.println("Gracias por su compra Señor/a " + capitan.getNombre() + " " + capitan.getApellido());
                            }
                            break;
                        default:
                            System.out.println("No hay ningun yate con ese indice");
                            break;
                    }
                    break;
                case 4: //Comprar yate
                    sc.nextLine();
                    System.out.print("Ingrese su nombre: ");
                    nombreCap = sc.nextLine();
                    System.out.print("Ingrese su apellido: ");
                    apellidoCap = sc.nextLine();
                    System.out.print("Ingrese su matricula de navegación: ");
                    matricula = sc.nextLine();
                    System.out.print("Ingrese el indice del yate (De la lista inicial): ");
                    int yateCompra = sc.nextInt();
                    sc.nextLine();
                    switch (yateCompra) {
                        case 1:
                            //Yate yate1 = new Yate(capitanBase, 2019, 108, 8)
                            ventaExitosa = yate1.comprar(bill);
                            if (ventaExitosa) {
                                bill -= yate1.calcularMontoCompraYate(); //Restamos el valor de la venta al saldo del cliente
                                Embarcacion.yates.remove(yate1);
                                capitan.setNombre(nombreCap);
                                capitan.setApellido(apellidoCap);
                                capitan.setMatriculaNavegacion(matricula);
                                System.out.println("Yate comprado con éxito, su cuenta actual es: " + bill + " COP");
                                System.out.println("Gracias por su compra Señor/a " + capitan.getNombre() + " " + capitan.getApellido());
                            }
                            break;
                        case 2:
                            //Yate yate2 = new Yate(capitanBase, 2013, 156, 7)
                            ventaExitosa = yate2.comprar(bill);
                            if (ventaExitosa) {
                                bill -= yate2.calcularMontoCompraYate();
                                Embarcacion.yates.remove(yate2);
                                capitan.setNombre(nombreCap);
                                capitan.setApellido(apellidoCap);
                                capitan.setMatriculaNavegacion(matricula);
                                System.out.println("Yate comprado con éxito, su cuenta actual es: " + bill + " COP");
                                System.out.println("Gracias por su compra Señor/a " + capitan.getNombre() + " " + capitan.getApellido());
                            }
                            break;
                        case 3:
                            //Yate yate3 = new Yate(capitanBase, 20231, 50, 2)
                            ventaExitosa = yate3.comprar(bill);
                            if (ventaExitosa) {
                                bill -= yate3.calcularMontoCompraYate();
                                Embarcacion.yates.remove(yate3);
                                capitan.setNombre(nombreCap);
                                capitan.setApellido(apellidoCap);
                                capitan.setMatriculaNavegacion(matricula);
                                System.out.println("Yate comprado con éxito, su cuenta actual es: " + bill + " COP");
                                System.out.println("Gracias por su compra Señor/a " + capitan.getNombre() + " " + capitan.getApellido());
                            }
                        case 4:
                            ventaExitosa = yate4.comprar(bill);
                            if (ventaExitosa) {
                                bill -= yate4.calcularMontoCompraYate();
                                Embarcacion.yates.remove(yate4);
                                capitan.setNombre(nombreCap);
                                capitan.setApellido(apellidoCap);
                                capitan.setMatriculaNavegacion(matricula);
                                System.out.println("Yate comprado con éxito, su cuenta actual es: " + bill + " COP");
                                System.out.println("Gracias por su compra Señor/a " + capitan.getNombre() + " " + capitan.getApellido());
                            }
                            break;
                        default:
                            System.out.println("No hay ningun yate con ese indice");
                            break;
                    }
                break;
                case 5:
                    System.out.println("Señor/a " + capitan.getNombre() + "  " + capitan.getApellido() + " identificado maritimamente con la matricula de Navegacion: " + capitan.getMatriculaNavegacion());
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
