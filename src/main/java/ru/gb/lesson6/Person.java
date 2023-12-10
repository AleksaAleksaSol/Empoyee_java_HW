package ru.gb.lesson6;

import java.util.Objects;

public class Person {
  // поля
  // конструкторы
  // методы

  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Person(String name) {
    this(name, 20);
//    this.name = name;
//    age = 20;
  }

  // геттер
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  // сеттер
  public void rename(String name) {
    if (name != null) {
      this.name = name;
    }
  }

  public void setAge(int age) {
    if (age > 0) {
      this.age = age;
    }
  }

  @Override
  public String toString() {
    return "Person[" + name + "], age = " + age;
  }

  @Override
  public boolean equals(Object anotherObject) {
    if (anotherObject == null) {
      return false;
    }
    if (!(anotherObject instanceof Person)) {
      return false;
    }

    Person anotherPerson = (Person) anotherObject;
    return name.equals(anotherPerson.getName()) && age == anotherPerson.getAge();
  }

  // if obj1.equals(obj2) => obj1.hashCode() == obj2.hashCode()
  // if obj1.hashCode() != obj2.hashCode() => !obj1.equals(obj2)
  @Override
  public int hashCode() {
//    return 0;
    return Objects.hash(name, age);
  }

}
