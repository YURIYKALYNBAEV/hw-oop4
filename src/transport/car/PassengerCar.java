package transport.car;

import transport.driver.DriverB;
import transport.exception.MissingDriverLicenseException;
import transport.Transport;

public class PassengerCar extends Transport<DriverB> {
    private CarBodyType carBodyType;

    public PassengerCar(String brand,
                        String model,
                        double engineVolume,
                        DriverB driver,
                        CarBodyType carBodyType) {
        super(brand, model, engineVolume, driver);
        setCarBodyType(carBodyType);
    }

    public void setCarBodyType(CarBodyType carBodyType) {
        this.carBodyType = carBodyType;
    }

    public CarBodyType getCarBodyType() {
        return carBodyType;
    }

    @Override
    public void startMoving() {
        System.out.println("Легковушка марки" + getBrand() + "начала движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Легковушка марки" + getBrand() + "закончила движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у легковушки");
    }

    @Override
    public void bestLapTime() {
        int minBound = 70;
        int maxBound = 120;
        int bestLapTime = (int) ((int) (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для легковушки в минутах" + bestLapTime);
    }

    @Override
    public void maximumSpeed() {
        int minBound = 100;
        int maxBound = 160;
        int maximumSpeed = (int) ((int) (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость для легковушки" + maximumSpeed);
    }

    @Override
    public void printType(Transport<?> transport) {
        if (carBodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("carBodyType = " + carBodyType);
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
