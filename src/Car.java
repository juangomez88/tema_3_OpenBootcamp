public class Car {

    //Por defecto el carro tiene una puerta

    private int numeroDePuertas = 0;

    public Car() {
    }

    public int addDoors(int numeroDePuertas){

        int numberDoors = numeroDePuertas + 1;

        return numberDoors;
    }

}
