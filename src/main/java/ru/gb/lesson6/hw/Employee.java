package ru.gb.lesson6.hw;

import java.util.Objects;

  /**
   * Создать класс Employee (сотрудник), у которого:
   * 1.1 Есть приватное поле String firstName (имя)
   * 1.2 Есть приватное поле String lastName (фамилия)
   * 1.3 Приватное поле int age (возраст)
   * 1.4 Приватное поле double salary (зарплата)
   * 2.1 Есть метод getAge, который возвращает возраст
   * 2.2 Есть метод getSalary, который возвращает зарплату
   * 2.3 Есть метод getFullName, который возвращает конкатенацию firstName и lastName
   * 2.4 Есть методы (сеттеры) для изменения всех полей (setAge, setSalary, setFirstName, setLastName)
   * 3.1 Есть конструктор, который принимает все 4 поля
   * 3.2 Есть конструктор, который принимает firstName, lastName и возраст (зарплата по умолчанию 1_000.0)
   * 3.3 Есть конструктор, который принимает firstName, lastName (зарплата по умолчанию 1_000.0, возраст по умолчанию 25)
   * 4. Реализовать метод toString, который выводит информацию о сотруднике в строковом представлении (формат придумать самостоятельно).
   * 5. Реализовать методы equals и hashCode, которые учитывают только firstName и lastName.
   *
   * Вся необходимая информация для реализации подробно разобрана на 6-ом семниаре 10.12.2023 (класс EanotherEmployee).
   *
   * Формат сдачи: ссылка на файл на github (предпочительный вариант).
   * Если с гитом не работали, то можно просто прикрепить сам файл.
   */


public class Employee {
  // 1.1 Есть приватное поле String firstName (имя)
  private String firstName;
  // 1.2 Есть приватное поле String lastName (фамилия)
  private String lastName;
  // 1.3 Приватное поле int age (возраст)
  private int age;
  // 1.4 Приватное поле double salary (зарплата)
  private double salary;
  // 2.1 Есть метод getAge, который возвращает возраст
  public int getAge() {
    return age;
  }
  // 2.2 Есть метод getSalary, который возвращает зарплату
  public double getSalary() {
  return salary;
  }
// Добавляем методы getFirstName + getLastName для последнего задания
  public String getFirstName() {
  return firstName;
  }
  public String getLastName() {
  return lastName;
  }
  // 2.3 Есть метод getFullName, который возвращает конкатенацию firstName и lastName
  public String getFullName() {
    return "Employee[" + firstName + "], lastName = " + lastName;
  }  
//  2.4 Есть методы (сеттеры) для изменения всех полей 
// (setAge, setSalary, setFirstName, setLastName)
public void setAge(int age) {
  if (age > 0) {
    this.age = age;
  }
}

public void setSalary(double salary) {
  this.salary = salary;
}

public void setFirstName(String firstName) {
  if (firstName != null) {
    this.firstName = firstName;
  }
}

public void setLastName(String lastName) {
  if (lastName != null) {
    this.lastName = lastName;
  }
}
// 3.1 Есть конструктор, который принимает все 4 поля
public Employee(String firstName, String lastName, int age, double salary) {
  this.firstName = firstName;
  this.lastName = lastName;
  this.age = age;
  this.salary = salary;
}
// 3.2 Есть конструктор, который принимает firstName, 
// lastName и возраст (зарплата по умолчанию 1_000.0)
public Employee(String firstName, String lastName, int age) {
  this.firstName = firstName;
  this.lastName = lastName;
  salary = 1000.0;
}
// 3.3 Есть конструктор, который принимает firstName, 
// lastName (зарплата по умолчанию 1_000.0, возраст 
// по умолчанию 25)
public Employee(String firstName, String lastName) {
  this(firstName, lastName, 25, 1000.0);
}
// 4. Реализовать метод toString, который выводит 
// информацию о сотруднике в строковом представлении
// (формат придумать самостоятельно).

@Override
public String toString() {
  return "Employee[" + firstName + lastName +"], age: " + age + ",  salary: " + salary;
}

// 5. Реализовать методы equals и hashCode, 
// которые учитывают только firstName и lastName.
  @Override
  public boolean equals(Object anotherObject) {
    if (anotherObject == null) {
      return false;
    }
    if (!(anotherObject instanceof Employee)) {
      return false;
    }

    Employee anotherEmployee = (Employee) anotherObject;
    return firstName.equals(anotherEmployee.getFirstName()) && lastName == anotherEmployee.getLastName();
  }
  @Override
  public int hashCode() {
  return Objects.hash(firstName, lastName);
  }

}