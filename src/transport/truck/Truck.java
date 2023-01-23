package transport.truck;

import transport.exception.MissingDriverLicenseException;
import transport.Transport;
import transport.driver.DriverC;

public class Truck extends Transport<DriverC> {
    private TruckTypeLoadCapacity truckTypeLoadCapacity;

    public Truck(String brand,
                 String model,
                 double engineVolume,
                 DriverC driver,
                 TruckTypeLoadCapacity truckTypeLoadCapacity) {
        super(brand, model, engineVolume, driver);
        setTruckTypeLoadCapacity(truckTypeLoadCapacity);
    }

    public void setTruckTypeLoadCapacity(TruckTypeLoadCapacity truckTypeLoadCapacity) {
        this.truckTypeLoadCapacity = truckTypeLoadCapacity;
    }

    public TruckTypeLoadCapacity getTruckTypeLoadCapacity() {
        return truckTypeLoadCapacity;
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик марки" + getBrand() + "начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Грузовик марки" + getBrand() + "закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у грузовика");
    }

    @Override
    public void bestLapTime() {
        int minBound = 90;
        int maxBound = 140;
        int bestLapTime = (int) ((int) (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для грузовика в минутах" + bestLapTime);
    }

    @Override
    public void maximumSpeed() {
        int minBound = 90;
        int maxBound = 130;
        int maximumSpeed = (int) ((int) (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость для грузовика" + maximumSpeed);
    }

    @Override
    public void printType(Transport<?> transport) {
        if (truckTypeLoadCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("truckTypeLoadCapacity = " + truckTypeLoadCapacity);
        }
    }

    @Override
    public void passDiagnostics(Transport<?> transport) throws MissingDriverLicenseException {
        if (getDriver().isHasDriverLicense()) {
            System.out.println(getBrand() + " " +
                    getModel() + " " +
                    getDriver().getName() +
                    " может пройти диагностику");
        } else {
            throw new MissingDriverLicenseException("Необходимо указать тип прав!");
        }
    }
}
