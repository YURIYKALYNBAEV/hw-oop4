package transport;

public class DriverD extends Driver {
    public DriverD(String name, boolean hasDriverLicense, int experienceInYears) {
        super(name, hasDriverLicense, experienceInYears);
    }
    @Override
    public void startMove() {
        System.out.println("Водитель категории Д " + getName() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории Д " + getName() + " закончил движение");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории Д " + getName() + " заправляет авто");
    }
}
