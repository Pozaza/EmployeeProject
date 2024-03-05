package org.example;

import java.time.LocalDate;

public class Main {
    static EmployeeUtils utils = new EmployeeUtils();
    public static void main(String[] args) {
        utils.Add(new Employee("Сигиль", "Максим", "Антонович", LocalDate.of(1985, 3, 24)));
        utils.Add(new Employee("Арванян", "Николай", "Алексеевич", LocalDate.of(1990, 1, 16)));
        utils.Add(new Employee("Крохина", "Наталья", "Владимировна", LocalDate.of(1995, 12, 1)));
        utils.Add(new Employee("Шольмина", "Ксения", "Сергеевна", LocalDate.of(1975, 8, 3)));

        utils.GetAll();

        System.out.println("\nПосле удаления:\n");

        utils.Remove("Крохина");

        utils.GetAll();

        System.out.println("\nПосле изменения:\n");

        utils.Edit("Арванян", new Employee("Арванян", "Сергей", "Алексеевич", LocalDate.of(1999, 1, 16)));

        utils.GetAll();
    }
}