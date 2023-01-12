import transport.*;

public class Main {
    public static void main(String[] args) {
        task();
    }
    public static void task() {
        // легковые
        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB(
                    "Driver cat.B #" + i,
                    true,
                    5 + i);
            PassengerCar passengerCar = new PassengerCar(
                    "Car brand #" + i,
                    "Car model #" + i,
                    1.6,
                    driverB);
            DriverC driverC = new DriverC(
                    "Driver cat.C #" + i,
                    true,
                    8 + i);
            Truck truck = new Truck(
                    "Truck brand #" + i,
                    "Truck model #" + i,
                    4.5,
                    driverC);
            DriverD driverD = new DriverD(
                    "Driver cat.D #" + i,
                    true,
                    10 + i);
            Bus bus = new Bus(
                    "Bus brand #" + i,
                    "Bus model #" + i,
                    4.0,
                    driverD);

            print(passengerCar);
            print(truck);
            print(bus);
        }
    }
    public static void print(Transport<?> transport) {
        System.out.println("водитель " + transport.getDriver().getName() + "управляет автомобилем " + transport.getBrand()
                + " и будет участвовать в заезде");
    }
}