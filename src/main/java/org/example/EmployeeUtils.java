package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeUtils {
    ArrayList<Employee> employees = new ArrayList<>();

    public void Add(Employee employee) {
        employees.add(employee);
    }

    public void Remove(String surname) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.Surname.equals(surname)) {
                iterator.remove();
                break;
            }
        }
    }

    public void Edit(String surname, Employee edited) {
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (employee.Surname.equals(surname)) {
                employees.set(i, edited);
                break;
            }
        }
    }

    public void GetAll() {
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);

            System.out.println("Работник №" + (i + 1) + ": " + employee.Surname + " " + employee.Name + " " + employee.LastName + ", возраст - " + employee.Age + ", дата рождения - " + employee.BirthDate.toString());
        }
    }
}
