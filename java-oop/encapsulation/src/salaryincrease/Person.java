package salaryincrease;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double incrementation) {
        double percentage = age < 30 ? incrementation / 200 : incrementation / 100;
        setSalary(getSalary() + (getSalary() * percentage));
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f", firstName, lastName, salary);
    }
}
