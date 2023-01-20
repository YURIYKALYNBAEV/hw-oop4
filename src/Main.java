import transport.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        task();
    }

    public static void task() {
        // легковые
        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB(
                    "Driver cat.B #" + i,
                    false,
                    5 + i);
            PassengerCar passengerCar = new PassengerCar(
                    "Car brand #" + i,
                    "Car model #" + i,
                    1.6,
                    driverB,
                    CarBodyType.BODY_TYPE3,
                    new CarMechanic("Иван", "Иванов", "Лада-Сервис"));
            DriverC driverC = new DriverC(
                    "Driver cat.C #" + i,
                    true,
                    8 + i);
            Truck truck = new Truck(
                    "Truck brand #" + i,
                    "Truck model #" + i,
                    4.5,
                    driverC,
                    TruckTypeLoadCapacity.CAPACITY_TYPE2,
                    new CarMechanic("Борис", "Борисов", "Лада-Сервис"));
            DriverD driverD = new DriverD(
                    "Driver cat.D #" + i,
                    true,
                    10 + i);
            Bus bus = new Bus(
                    "Bus brand #" + i,
                    "Bus model #" + i,
                    4.0,
                    driverD,
                    BusTypeOfSeats.BUS_TYPE_OF_SEATS1,
                    new CarMechanic("Василий", "Васильев", "Лада-Сервис"));

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

        PassengerCar kia = new PassengerCar("kia",
                "ceed",
                1.6,
                new DriverB("Petrov", false, 10),
                CarBodyType.BODY_TYPE3,
                new CarMechanic("Иван", "Иванов", "Лада-Сервис"));
        checkDriverLicense(kia);
        Truck kamaz = new Truck("KAMAZ",
                "5311",
                3.3,
                new DriverC("Ivanov", true, 15),
                TruckTypeLoadCapacity.CAPACITY_TYPE3,
                new CarMechanic("Борис", "Борисов", "Лада-Сервис"));
        checkDriverLicense(kamaz);

        // Коллекции. Списки
        // водители
        DriverB ivan1 = new DriverB("Иван1", false, 10);
        DriverB ivan4 = new DriverB("Иван4", false, 10);
        DriverB ivan5 = new DriverB("Иван5", false, 10);
        DriverC ivan2 = new DriverC("Иван2", true, 15);
        DriverD ivan3 = new DriverD("Иван3", true, 8);

        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(ivan1);
        drivers.add(ivan2);
        drivers.add(ivan3);

        //механики
        CarMechanic ivanIvanov1 = new CarMechanic("Иван1", "Иванов1", "Лада-Сервис");
        CarMechanic ivanIvanov2 = new CarMechanic("Иван2", "Иванов2", "Лада-Сервис");
        CarMechanic ivanIvanov3 = new CarMechanic("Иван3", "Иванов3", "Лада-Сервис");
        CarMechanic ivanIvanov4 = new CarMechanic("Иван4", "Иванов4", "Лада-Сервис");
        CarMechanic ivanIvanov5 = new CarMechanic("Иван5", "Иванов5", "Лада-Сервис");
        CarMechanic ivanIvanov6 = new CarMechanic("Иван6", "Иванов6", "Лада-Сервис");
        CarMechanic ivanIvanov7 = new CarMechanic("Иван7", "Иванов7", "Лада-Сервис");

        ArrayList<CarMechanic> carMechanics = new ArrayList<>();
        carMechanics.add(ivanIvanov1);
        carMechanics.add(ivanIvanov2);
        carMechanics.add(ivanIvanov3);
        carMechanics.add(ivanIvanov4);
        carMechanics.add(ivanIvanov5);
        carMechanics.add(ivanIvanov6);
        carMechanics.add(ivanIvanov7);

        ivanIvanov1.performMaintenance();
        ivanIvanov5.fixCar();

        //машины
        PassengerCar kiaSportage = new PassengerCar("kia",
                "Sportage 4-го поколения",
                2.4,
                ivan1,
                CarBodyType.BODY_TYPE3,
                ivanIvanov1);
        PassengerCar audi = new PassengerCar("Audi",
                "A8 50 L TDI quattro",
                3.0,
                ivan4,
                CarBodyType.BODY_TYPE3,
                ivanIvanov1);
        PassengerCar bmw = new PassengerCar("BMW",
                "Z8",
                3.0,
                ivan5,
                CarBodyType.BODY_TYPE3,
                ivanIvanov2);

        Truck kamaz5311 = new Truck("KAMAZ",
                "5311",
                3.3,
                ivan2,
                TruckTypeLoadCapacity.CAPACITY_TYPE3,
                ivanIvanov3);

        Bus kavz4270 = new Bus("КАВЗ",
                "КАВЗ-4270",
                3.0,
                ivan3,
                BusTypeOfSeats.BUS_TYPE_OF_SEATS3,
                ivanIvanov4);

        ArrayList<Transport> cars = new ArrayList<>();
        cars.add(kiaSportage);
        cars.add(audi);
        cars.add(bmw);
        cars.add(kamaz5311);
        cars.add(kavz4270);

        printInfo(cars);
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

    public static void checkDriverLicense(Transport<?> transport) {
        try {
            transport.passDiagnostics(transport);
        } catch (MissingDriverLicenseException e) {
            System.out.println("Ошибка - у водителя " +
                    transport.getDriver().getName() + " нет прав");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Выполняюсь всегда");
        }
    }

    public static void printInfo(ArrayList<Transport> cars) {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Машина: " +
                    "бренд: " + cars.get(i).getBrand() +
                    " модель: " + cars.get(i).getModel() +
                    " водитель: " + cars.get(i).getDriver().getName() +
                    " механик: " + cars.get(i).getMechanic().getName() +
                    " " + cars.get(i).getMechanic().getSurname());
        }
    }
}