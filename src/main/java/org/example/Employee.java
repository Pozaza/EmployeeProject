package org.example;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    public String Surname;
    public String Name;
    public String LastName;
    public short Age;
    public LocalDate BirthDate;

    public Employee(String Surname, String Name, String LastName, LocalDate BirthDate) {
        this.Surname = Surname;
        this.Name = Name;
        this.LastName = LastName;
        this.BirthDate = BirthDate;
        this.Age = calculateAge(BirthDate);
    }

    private short calculateAge(LocalDate birthDate) {
        return (short)Period.between(birthDate, LocalDate.now()).getYears();
    }
}
