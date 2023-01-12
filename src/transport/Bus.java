package transport;

public class Bus extends Transport <DriverD>{
    public Bus(String brand,
               String model,
               double engineVolume,
               DriverD driver) {
        super(brand, model, engineVolume, driver);
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
        int minBound = 100;
        int maxBound = 150;
        int bestLapTime = (int) ((int) (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для автобуса в минутах" + bestLapTime);
    }

    @Override
    public void MaximumSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maximumSpeed = (int) ((int) (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость для автобуса" + maximumSpeed);
    }
}