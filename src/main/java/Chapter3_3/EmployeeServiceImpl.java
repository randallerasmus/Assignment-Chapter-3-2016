package Chapter3_3;

import za.ac.cput.Chapter3_3.services.PersonInterface;

/**
 * Created by User on 2016/10/25.
 */
public class EmployeeServiceImpl implements PersonInterface
{
    private String name;
    private String surname;
    private String studentNumber;
    private String offeringType;

    public EmployeeServiceImpl() {
    }

    public EmployeeServiceImpl(String name, String surname, String employeeNumber, String employmentType) {
        this.name = name;
        this.surname = surname;
        this.studentNumber = studentNumber;
        this.offeringType = offeringType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getOfferingType() {
        return offeringType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeServiceImpl that = (EmployeeServiceImpl) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (offeringType != null ? !offeringType.equals(that.offeringType) : that.offeringType != null) return false;
        if (studentNumber != null ? !studentNumber.equals(that.studentNumber) : that.studentNumber != null)
            return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (studentNumber != null ? studentNumber.hashCode() : 0);
        result = 31 * result + (offeringType != null ? offeringType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "EmployeeServiceImpl{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", offeringType='" + offeringType + '\'' +
                '}';
    }
}