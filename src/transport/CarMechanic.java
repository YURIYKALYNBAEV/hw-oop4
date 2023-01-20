package transport;

public class CarMechanic {
    private String name;
    private String surname;
    private String company;

    public CarMechanic(String name,
                       String surname,
                       String company) {
        setName(name);
        setSurname(surname);
        setCompany(company);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "CarMechanic{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    //провести техобслуживание
    public void performMaintenance() {
        System.out.println("Механик: " + getName() + " " + getSurname() + " начал техобслуживание");
    }

    //починить машину
    public void fixCar() {
        System.out.println("Механик: " + getName() + " " + getSurname() + " начал чинить машину");
    }

}
