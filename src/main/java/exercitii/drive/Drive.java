package exercitii.drive;

public class Drive {
    public static void main(String[] args) {
        Car car1 = new Car(0, 0);
        Bicycle bicycle1 = new Bicycle(0, 0);

        accelerate(car1, 25);
        accelerate(bicycle1, 7);

        System.out.println("Viteza masinii este " + car1.getCurrentSpeed());
        System.out.println("Viteza bicicletei este " + bicycle1.getCurrentSpeed());

    }

    public static void accelerate(Vehicle vehicle, int speed) {
        vehicle.accelerate(speed);
    }
}
