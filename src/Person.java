import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        if (this.age <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean hasAddress() {
        if (!this.address.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

//    public int getAge() {
//        return age;
//    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        this.age++;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder childBuilder = new PersonBuilder();
        childBuilder.setSurname(getSurname());
        childBuilder.setAddress(getAddress());
        return childBuilder;
    }

    @Override
    public String toString() {
        return " " + getName() +
                " " + getSurname() +
                " [возраст - " + getAge().getAsInt() + "]" +
                ", с местом жительства в " + getAddress();

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }
}
