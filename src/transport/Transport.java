package transport;

public abstract class Transport<T extends Driver> implements Competing {
    public static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VOLUME = 1.5;
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    public CarMechanic mechanic;

    public Transport(String brand,
                     String model,
                     double engineVolume,
                     T driver,
                     CarMechanic mechanic) {
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
        setMechanic(mechanic);
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

    public CarMechanic getMechanic() {
        return mechanic;
    }

    public void setMechanic(CarMechanic mechanic) {
        this.mechanic = mechanic;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    public abstract void startMoving();

    public abstract void finishMoving();

    public abstract void printType(Transport<?> transport);

    public  void passDiagnostics(Transport<?> transport) throws MissingDriverLicenseException {
        System.out.println("Проверка прохождения диагностики");
    }
}
