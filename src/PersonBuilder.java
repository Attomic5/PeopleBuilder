public class PersonBuilder {

    protected String name = "";
    protected String surname = "";
    protected int age;
    protected String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        Person person = new Person(name, surname, age, address);
        if (person.age < 0) {
            throw new IllegalArgumentException("Неправильно указан возраст");
        } else {
            this.age = age;
            return this;
        }

    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        Person person = new Person(name, surname, age, address);
        if (person.name.isEmpty() || person.surname.isEmpty()) {
            throw new IllegalStateException("Не указано имя или фамилия");
        } else {
            return person;
        }
    }

}
