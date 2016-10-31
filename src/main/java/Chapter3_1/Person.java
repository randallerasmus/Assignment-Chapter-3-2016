package Chapter3_1;

import java.sql.Date;

/**
 * Created by User on 2016/10/25.
 */
public class Person {

    private String name;
    private String surname;
    private int age;
    private String IDNumber;


    public Person() {
    }

    public Person(String name, String surname, int age, String IDNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.IDNumber = IDNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (IDNumber != null ? !IDNumber.equals(person.IDNumber) : person.IDNumber != null) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (surname != null ? !surname.equals(person.surname) : person.surname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (IDNumber != null ? IDNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", IDNumber='" + IDNumber + '\'' +
                '}';
    }
}
