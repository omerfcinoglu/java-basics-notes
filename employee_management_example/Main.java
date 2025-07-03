import java.util.*;

public class Main {
  public static void main(String[] args) {
    Company comp = new Company();

    comp.addEmployee(0, new Employee("ömer", 25, 5000));
    comp.addEmployee(1, new Employee("faruk", 56, 10000));
    comp.addEmployee(2, new Employee("ali", 15, 1000));
    comp.addEmployee(3, new Employee("veli", 35, 6000));
    comp.addEmployee(4, new Employee("ayse", 21, 3000));

    System.out.println(comp.calculateTotalSalary());
    Employee oldest = comp.getOldestEmployee();
    System.out.println(oldest.getName() + " " + oldest.getAge());
  }
}

/*
 * output:
 * 24500
 * faruk 56
 */