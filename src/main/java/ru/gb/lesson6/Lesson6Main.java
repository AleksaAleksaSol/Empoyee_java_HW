package ru.gb.lesson6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lesson6Main {

  public static void main(String[] args) {
//    basic();
    // Map -> HashMap, TreeMap, LinkedHashMap

    // Set -> HashSet, TreeSet, LinkedHashSet
    HashSet<String> strings = new HashSet<>();
    strings.add("Java");

    TreeSet<String> treeSet = new TreeSet<>();
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
  }

  private static void basic() {
    // Set
    Set<String> strings = new HashSet<>();
    strings.add("Java");
    strings.add("Python");
    strings.add("C++");

    System.out.println(strings);

    for (String elem: strings) {
      System.out.println(elem);
    }

    System.out.println(strings.add("Java")); // false
    System.out.println(strings.add("Java")); // false
    System.out.println();
    System.out.println(strings.contains("Java")); // true
    System.out.println(strings.contains("Python")); // true
    System.out.println();
    System.out.println(strings.remove("Python")); // true
    System.out.println(strings.remove("Java")); // true
    System.out.println(strings.remove("Java")); // false
  }

}
