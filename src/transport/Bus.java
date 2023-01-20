package transport;

public class Bus extends Transport<DriverD> {
    public BusTypeOfSeats busTypeOfSeats;

    public Bus(String brand,
               String model,
               double engineVolume,
               DriverD driver,
               BusTypeOfSeats busTypeOfSeats,
               CarMechanic mechanic) {
        super(brand, model, engineVolume, driver, mechanic);
        setBusTypeOfSeats(busTypeOfSeats);
    }

    public BusTypeOfSeats getBusTypeOfSeats() {
        return busTypeOfSeats;
    }

    public void setBusTypeOfSeats(BusTypeOfSeats busTypeOfSeats) {
        this.busTypeOfSeats = busTypeOfSeats;
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус марки" + getBrand() + "начала движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автобус марки" + getBrand() + "закончил движение");
    }

    @Override
    public void PitStop() {
        System.out.println("Пит-стоп у автобуса");
    }

    @Override
    public void BestLapTime() {
        int minBound = 90;
        int maxBound = 150;
        int bestLapTime = (int) ((int) (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для автобуса в минутах" + bestLapTime);
    }

    @Override
    public void MaximumSpeed() {
        int minBound = 70;
        int maxBound = 120;
        int maximumSpeed = (int) ((int) (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость для автобуса" + maximumSpeed);
    }

    @Override
    public void printType(Transport<?> transport) {
        if (busTypeOfSeats == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("busTypeOfSeats = " + busTypeOfSeats);
        }
    }
}
