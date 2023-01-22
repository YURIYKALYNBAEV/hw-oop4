package transport.mechanic;

public class Mechanic {
    private String name;
    private String surname;
    private String company;
    private TypeTransport typeTransport;

    public Mechanic(String name,
                    String surname,
                    String company,
                    TypeTransport typeTransport) {
        setName(name);
        setSurname(surname);
        setCompany(company);
        setTypeTransport(typeTransport);
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

    public TypeTransport getTypeTransport() {
        return typeTransport;
    }

    public void setTypeTransport(TypeTransport typeTransport) {
        this.typeTransport = typeTransport;
    }

    @Override
    public String toString() {
        return "Механик " +
                name +
                " " + surname +
                " из компании " + company;
    }

    //провести техобслуживание
    public void performMaintenance() {
        System.out.println("Механик: " + name + " " + surname +
                " из компании " + company + " начал техобслуживание");
    }

    //починить машину
    public void fixCar() {
        System.out.println("Механик: " + name + " " + surname +
                " из компании " + company + " начал чинить машину");
    }

}
