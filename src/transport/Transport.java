package transport;

import transport.driver.Driver;
import transport.exception.MissingDriverLicenseException;
import transport.mechanic.Mechanic;

import java.util.*;

public abstract class Transport<T extends Driver> implements Competing {
    public static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VOLUME = 1.5;
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    private final Set<Mechanic> mechanics = new HashSet<>();

    public Transport(String brand,
                     String model,
                     double engineVolume,
                     T driver) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }
        setEngineVolume(engineVolume);
        setDriver(driver);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = DEFAULT_ENGINE_VOLUME;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public Set<Mechanic> getMechanics() {
        return mechanics;
    }

    public void addMechanic(Mechanic mechanic) {
        mechanics.add(mechanic);
    }


    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return brand.equals(transport.brand)
                && model.equals(transport.model)
                && Double.compare(transport.engineVolume, engineVolume) == 0
                && driver.equals(transport.driver)
                && mechanics.equals(transport.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driver, mechanics);
    }

    public abstract void startMoving();

    public abstract void finishMoving();

    public abstract void printType(Transport<?> transport);

    public void passDiagnostics(Transport<?> transport) throws MissingDriverLicenseException {
        System.out.println("Проверка прохождения диагностики");
    }
}
