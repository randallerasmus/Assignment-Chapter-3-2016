package Chapter3_2;

import za.ac.cput.Chapter3_2.services.PersonInterface;

/**
 * Created by User on 2016/10/25.
 */
public class StudentServiceImpl implements PersonInterface
{
    private String name;
    private String surname;

    private String employeeNumber;
    private String employmentType;


    public StudentServiceImpl() {
    }

    public StudentServiceImpl(String name, String surname, String studentNumber, String offeringType) {
        this.name = name;
        this.surname = surname;
        this.employeeNumber = employeeNumber;
        this.employmentType = employmentType;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentServiceImpl that = (StudentServiceImpl) o;

        if (employeeNumber != null ? !employeeNumber.equals(that.employeeNumber) : that.employeeNumber != null)
            return false;
        if (employmentType != null ? !employmentType.equals(that.employmentType) : that.employmentType != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (employeeNumber != null ? employeeNumber.hashCode() : 0);
        result = 31 * result + (employmentType != null ? employmentType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "StudentServiceImpl{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", employmentType='" + employmentType + '\'' +
                '}';
    }
}
