public class Vehicle1 {
    static class Vehicle {
        void displayVehicleType() {
            System.out.println("Vehicle Type: Common Vehicle");
        }
    }

    static class Car extends Vehicle {
        void displayWheels() {
            System.out.println("Car has Four Wheels");
        }
    }

    static class Bike extends Vehicle {
        void displayWheels() {
            System.out.println("Bike has Two Wheels");
        }
    }

    static class Auto extends Vehicle {
        void displayWheels() {
            System.out.println("Auto has Three Wheels");
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Auto auto = new Auto();

        car.displayVehicleType();
        car.displayWheels();

        bike.displayVehicleType();
        bike.displayWheels();

        auto.displayVehicleType();
        auto.displayWheels();
    }
}
