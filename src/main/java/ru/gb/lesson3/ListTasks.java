package ru.gb.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class ListTasks {

  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<>(
      Arrays.asList("java", "python", "c++", "java", "java", "javascript", "python", "kotlin")
    );
    printCount(strings);

    System.out.println(strings); // ["java", "python", "c++", "java", "java", "javascript", "python", "kotlin"]
    removeDuplicates(strings);
    System.out.println(strings); // ["java", "python", "c++", "javascript", "kotlin"]

    Collections.sort(strings);
    System.out.println(strings);
  }

  // Написать метод, который принимает список целых чисел и возвращает список, в котром только четные числа.
  // [1, 5, 2, 2, 3, 7, 8, 11, 24]
  // -> [2, 2, 8, 24]
  static ArrayList<Integer> findEvenNumbers(ArrayList<Integer> integers) {
    ArrayList<Integer> result = new ArrayList<>();
    for (Integer value : integers) {
      if (value % 2 == 0) {
        result.add(value);
      }
    }
    return result;
  }

  // Написать метод, который удалит повторяющиеся элементы из списка (порядок неважен)
  // ["java", "python", "c++", "java", "javascript", "python", "kotlin"]
  // ["java", "python", "c++", "javascript", "kotlin"]
  static void removeDuplicates(ArrayList<String> strings) {
    for (int i = 0; i < strings.size(); i++) {
      String element = strings.get(i);
      for (int j = i + 1; j < strings.size(); j++) {
        String anotherElement = strings.get(j);
        if (element.equals(anotherElement)) {
          strings.remove(j);
          j--;
        }
      }
    }
  }

  // Написать метод, который принимает список строк и выводит информацию о том, сколько раз встреачалсь каждая строка.
  // ["java", "python", "c++", "java", "java", "javascript", "python", "kotlin"]
  // "java" -> 3
  // "python -> 2
  // "c++" -> 1
  // "javascript" -> 1
  // "kotlin" -> 1
  static void printCount(ArrayList<String> strings) {
    HashSet<String> visited = new HashSet<>();
    for (int i = 0; i < strings.size(); i++) {
      String element = strings.get(i);
      if (!visited.contains(element)) {
        int count = 1;
        for (int j = i + 1; j < strings.size(); j++) {
          String anotherElement = strings.get(j);
          if (element.equals(anotherElement)) {
            count++;
          }
        }
        System.out.println(element + " -> " + count);
        visited.add(element);
      }
    }
  }

}
