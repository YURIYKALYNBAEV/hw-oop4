package transport.driver;

public class DriverC extends Driver {
    public DriverC(String name, boolean hasDriverLicense, int experienceInYears) {
        super(name, hasDriverLicense, experienceInYears);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории С " + getName() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории С " + getName() + " закончил движение");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории С " + getName() + " заправляет авто");
    }
}
