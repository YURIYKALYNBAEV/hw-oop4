package transport.driver;

public class DriverB extends Driver {
    public DriverB(String name,
                   boolean hasDriverLicense,
                   int experienceInYears) {
        super(name, hasDriverLicense, experienceInYears);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории В " + getName() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории В " + getName() + " закончил движение");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории В " + getName() + " заправляет авто");
    }
}
