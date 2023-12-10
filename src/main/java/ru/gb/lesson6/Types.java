package ru.gb.lesson6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Types {

  public static void main(String[] args) {
    // инкапсуляция
//    basic();
//    hashes();

    ArrayList<String> integers = new ArrayList<>(100);
    integers.add("Java");

  }

  private static void hashes() {
    Person first = new Person("Igor", 40);
    Person second = new Person("Igor", 20);

    System.out.println(first == second);      // false
    System.out.println(first.equals(second)); // true

    System.out.println(first.hashCode());
    System.out.println(second.hashCode());
    HashSet<Person> persons = new HashSet<>();
    System.out.println(persons.add(first)); // true
    System.out.println(persons.add(second)); // false

    System.out.println(persons.size());
    System.out.println(persons);
  }

  private static void basic() {
    Person person = new Person("Igor", 180);
    person.rename("Igor"); // person.name = "Igor";
    person.setAge(180); // person.age = 180;

    String name = person.getName(); // person.name;
    System.out.println(name);

    Person newPerson = new Person("Igor-2");
    System.out.println(newPerson.getAge()); // 20

    System.out.println(person);
    System.out.println(newPerson);

    List<Person> personsList = new ArrayList<>();
    personsList.add(person);
    personsList.add(new Person("Mario", 100));
    System.out.println(personsList);
  }

}
