import java.util.ArrayList;

public class Parqueadero {
    private Carro[][] espaciosEstacionamiento;
    private double tarifaHora;

    public Parqueadero(double tarifaHora) {
        this.espaciosEstacionamiento = new Carro[5][10];
        this.tarifaHora = tarifaHora;
    }

    public boolean parquearCarro(Carro carro, int fila, int columna) {
        fila -= 1; //Le restamos uno a ambas variables por que los indices de la matriz empiezan desde 0
        columna -= 1;
        if (fila >= 0 && fila < 5 && columna >= 0 && columna < 10) {
            if (espaciosEstacionamiento[fila][columna] == null) {
                espaciosEstacionamiento[fila][columna] = carro;
                System.out.println("Carro con placa " + carro.getPlaca() + " estacionado con éxito en la fila " + (fila+1) + ", columna " + (columna+1));
                return true;
            }
        }
        System.out.println();
        System.out.println("Su auto no se puedo estacionar.");
        System.out.println("Espacio en la fila " + (fila+1) + ", columna " + (columna+1) + ", ocupado.");
        return false;
    }
    public double cobrarPorTiempo(Carro carro, int horas){ //Se multiplica el tiempo que estara por la tarifa
        double cobro = tarifaHora * horas;
        System.out.println("El auto con placa " + carro.getPlaca() + " deberá pagar " + cobro);
        System.out.println();
        return cobro;
    }
    public void retirarCarro(String placa){ //Para retirar un auto, se le pide al usuario la placa del carro
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                Carro carro = espaciosEstacionamiento[fila][columna]; //se crea un objeto de tipo carro que tendra una ubicacion diferente cada que itere el ciclo
                if (carro != null && carro.getPlaca().equals(placa)) { //Se verifique si en la posición de carro, hay algo y si la placa es igual a la ingresada
                    espaciosEstacionamiento[fila][columna] = null; // Si es así, se actualiza la matriz de espacios ocupados
                    System.out.println("Carro con placa " + placa + " retirado con éxito.");
                }
            }
        }
    }
    public void mostrarParqueadero() {
        System.out.print("  ");
        for (int e = 0; e < 10; e++) {
            System.out.print( " " + (e + 1)); //Muestra los numeros de las filas
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + " "); //Muestra los numeros de las columnas
            for (int j = 0; j < 10; j++) {
                if (espaciosEstacionamiento[i][j] != null) {
                    System.out.print("|x");
                } else {
                    System.out.print("| ");
                }
            }
            System.out.println();
            for (int j = 0; j < 10; j++) {
                System.out.print(" "); //Separar las filas
            }
            System.out.println();
        }
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
        System.out.println("Tarifa cambiada con éxito, la tarifa por hora ahora es: " + tarifaHora);
    }
}
