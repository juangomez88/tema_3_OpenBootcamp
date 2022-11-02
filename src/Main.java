import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numbers[] = new int[3];

        int numeroPuertas = 0;

        sumaNumeros miFuncion = new sumaNumeros();
        Car miCArro = new Car();

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el numero " + (i+1));
            numbers[i] = Integer.parseInt(in.next());
        }

        System.out.println("La suma de los números es: " + miFuncion.sumar(numbers[0],numbers[1],numbers[2]));

        System.out.println("Ingrese el número de puertas adicionales del carro: ");
        numeroPuertas = Integer.parseInt(in.next());
        System.out.println("El carro tiene " + miCArro.addDoors(numeroPuertas));

    }
}