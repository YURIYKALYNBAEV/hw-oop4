package transport;

public class Truck extends Transport<DriverC>{
    public Truck(String brand,
                 String model,
                 double engineVolume,
                 DriverC driver) {
        super(brand, model, engineVolume, driver);
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
    public void PitStop() {
        System.out.println("Пит-стоп у грузовика");
    }
    @Override
    public void BestLapTime() {
        int minBound = 90;
        int maxBound = 140;
        int bestLapTime = (int) ((int) (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для грузовика в минутах" + bestLapTime);
    }

    @Override
    public void MaximumSpeed() {
        int minBound = 90;
        int maxBound = 130;
        int maximumSpeed = (int) ((int) (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость для грузовика" + maximumSpeed);
    }
}