package transport;

public class PassengerCar extends Transport<DriverB>{
    public PassengerCar(String brand,
                        String model,
                        double engineVolume,
                        DriverB driver) {
        super(brand, model, engineVolume, driver);
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
    public void PitStop() {
        System.out.println("Пит-стоп у легковушки");
    }
    @Override
    public void BestLapTime() {
        int minBound = 70;
        int maxBound = 120;
        int bestLapTime = (int) ((int) (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для легковушки в минутах" + bestLapTime);
    }

    @Override
    public void MaximumSpeed() {
        int minBound = 100;
        int maxBound = 160;
        int maximumSpeed = (int) ((int) (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость для легковушки" + maximumSpeed);
    }
}
