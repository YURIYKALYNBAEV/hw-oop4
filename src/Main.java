import transport.*;
import transport.bus.Bus;
import transport.bus.BusTypeOfSeats;
import transport.car.CarBodyType;
import transport.car.PassengerCar;
import transport.driver.Driver;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;
import transport.exception.MissingDriverLicenseException;
import transport.mechanic.Mechanic;
import transport.mechanic.TypeTransport;
import transport.truck.Truck;
import transport.truck.TruckTypeLoadCapacity;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        task();
    }

    public static void task() {

        DriverB driverB = new DriverB(
                "Иван",
                true,
                5);
        DriverB driverB1 = new DriverB(
                "Иван",
                true,
                5);
        DriverB driverB2 = new DriverB(
                "Иван",
                true,
                5);


        PassengerCar bmw = new PassengerCar(
                "BMW",
                "Z8",
                3.0,
                driverB,
                CarBodyType.BODY_TYPE3);

        DriverC driverC = new DriverC(
                "Борис",
                true,
                8);
        DriverC driverC1 = new DriverC(
                "Борис",
                true,
                8);
        Truck kamaz5311 = new Truck("KAMAZ",
                "5311",
                3.3,
                driverC,
                TruckTypeLoadCapacity.CAPACITY_TYPE3);

        DriverD driverD = new DriverD(
                "Василий",
                true,
                10);
        DriverD driverD1 = new DriverD(
                "Василий",
                true,
                10);
        Bus kavz4270 = new Bus("КАВЗ",
                "КАВЗ-4270",
                3.0,
                driverD,
                BusTypeOfSeats.BUS_TYPE_OF_SEATS3);

        // Коллекции. Списки

        //водители
//        List<Driver> drivers = new ArrayList<>();
        Set<Driver> drivers = new HashSet<>();

        drivers.add(driverB);
        drivers.add(driverB1);
        drivers.add(driverB2);

        drivers.add(driverC);
        drivers.add(driverC1);

        drivers.add(driverD);
        drivers.add(driverD1);

        for (Driver driver : drivers) {
            System.out.println(driver);
        }

        System.out.println();

        //механики
        Mechanic mechanic1 = new Mechanic("Иван1", "Иванов1", "Лада-Сервис1", TypeTransport.CAR);
        Mechanic mechanic8 = new Mechanic("Иван1", "Иванов1", "Лада-Сервис1", TypeTransport.CAR);
        Mechanic mechanic2 = new Mechanic("Иван2", "Иванов2", "Лада-Сервис2", TypeTransport.CAR);
        Mechanic mechanic9 = new Mechanic("Иван2", "Иванов2", "Лада-Сервис2", TypeTransport.CAR);
        Mechanic mechanic3 = new Mechanic("Иван3", "Иванов3", "Лада-Сервис3", TypeTransport.TRUCK);
        Mechanic mechanic4 = new Mechanic("Иван4", "Иванов4", "Лада-Сервис4", TypeTransport.TRUCK);
        Mechanic mechanic5 = new Mechanic("Иван5", "Иванов5", "Лада-Сервис5", TypeTransport.TRUCK);
        Mechanic mechanic6 = new Mechanic("Иван6", "Иванов6", "Лада-Сервис6", TypeTransport.BUS);
        Mechanic mechanic7 = new Mechanic("Иван7", "Иванов7", "Лада-Сервис7", TypeTransport.ALL);

        // повтор
        bmw.addMechanic(mechanic1);
        bmw.addMechanic(mechanic2);
        bmw.addMechanic(mechanic8);
        bmw.addMechanic(mechanic9);

        kamaz5311.addMechanic(mechanic3);
        kamaz5311.addMechanic(mechanic4);
        kamaz5311.addMechanic(mechanic5);

        kavz4270.addMechanic(mechanic6);
        kavz4270.addMechanic(mechanic7);

        // машины
        List<Transport<?>> carsList = new ArrayList<>();
        carsList.add(bmw);
        carsList.add(kamaz5311);
        carsList.add(kavz4270);

        for (Transport<?> transport : carsList) {
            System.out.println(transport + " " + transport.getMechanics());
        }

        //
        Map<Transport<?>, Mechanic> transportMechanicMap = new HashMap<>();

        for (Transport<?> transport : carsList) {
            Set<Mechanic> mechanics = transport.getMechanics();
            for (Mechanic mechanic : mechanics) {
                transportMechanicMap.put(transport, mechanic);
            }
        }
        System.out.println();
        for (Map.Entry<Transport<?>, Mechanic> entry : transportMechanicMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
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
}