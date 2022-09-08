package firstandreserveteam;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public void setLastName(String lastName) {
        ensureNameLength(lastName, "Last");
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        ensureNameLength(firstName, "First");
        this.firstName = firstName;
    }

    private void ensureNameLength(String name, String nameType) {
        if (name.length() < 3) {
            throw new IllegalArgumentException(nameType + " name cannot be less than 3 symbols");
        }
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
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
