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
                    driverB,
                    CarBodyType.BODY_TYPE3);
            DriverC driverC = new DriverC(
                    "Driver cat.C #" + i,
                    true,
                    8 + i);
            Truck truck = new Truck(
                    "Truck brand #" + i,
                    "Truck model #" + i,
                    4.5,
                    driverC,
                    TruckTypeLoadCapacity.CAPACITY_TYPE2);
            DriverD driverD = new DriverD(
                    "Driver cat.D #" + i,
                    true,
                    10 + i);
            Bus bus = new Bus(
                    "Bus brand #" + i,
                    "Bus model #" + i,
                    4.0,
                    driverD,
                    BusTypeOfSeats.BUS_TYPE_OF_SEATS1);

            print(passengerCar);
            passengerCar.printType(passengerCar);
            print(truck);
            truck.printType(truck);
            print(bus);
            bus.printType(bus);
        }
        printCarBodyType();
        printTruckTypeLoadCapacity();
        printBusTypeOfSeats();


    }

    public static void print(Transport<?> transport) {
        System.out.println("водитель " + transport.getDriver().getName() + "управляет автомобилем " + transport.getBrand()
                + " и будет участвовать в заезде");
    }

    public static void printCarBodyType() {
        for (CarBodyType carType : CarBodyType.values()) {
            System.out.println(carType);
        }
    }
    public static void printTruckTypeLoadCapacity() {
        for (TruckTypeLoadCapacity truckType : TruckTypeLoadCapacity.values()) {
            System.out.println(truckType);
        }
    }
    public static void printBusTypeOfSeats() {
        for (BusTypeOfSeats busType : BusTypeOfSeats.values()) {
            System.out.println(busType);
        }
    }


}