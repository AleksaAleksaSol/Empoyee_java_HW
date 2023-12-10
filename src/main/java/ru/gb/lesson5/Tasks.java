package ru.gb.lesson5;

import java.util.*;

public class Tasks {

  public static void main(String[] args) {
    String text = "Java C# Kotlin Golang Java Pascal Pascal";
//    Map<String, Integer> stats = frequency(text);
//    System.out.println(stats);

    printLengths(text);
  }

  /**
   * Написать метод, который принимает текст (строку) и печатает информацию в следующем виде:
   * длина слова -> [слова, у которых заданная длина]
   * Вывод должен быть отсортирован по возрастанию длины слова
   * <p>
   * Java C# Kotlin Golang Java Pascal Pascal
   * 2 -> [C#]
   * 4 -> [Java]
   * 6 -> [Kotlin, Golang, Pascal]
   */
  static void printLengths(String text) {
    String[] words = text.replaceAll("[^A-Za-z]", " ").split("\\s+");

    Map<Integer, Set<String>> stats = new HashMap<>();
    for (String word : words) {
      int length = word.length();
      if (!stats.containsKey(length)) {
        Set<String> newList = new TreeSet<>();
        newList.add(word);
        stats.put(length, newList);
      } else {
        Set<String> existsWords = stats.get(length);
        existsWords.add(word);
        stats.put(length, existsWords);
      }
    }

    for (Integer key : stats.keySet()) {
      System.out.println(key + " -> " + stats.get(key));
    }
  }

  /**
   * Написать метод, который принимает текст (строку) и возвращает Map<String, Integer> со статистикой, какое слово сколько раз встречается.
   */
  static Map<String, Integer> frequency(String text) {
    String[] words = text.replaceAll("[^A-Za-z]", " ").split("\\s+");

    Map<String, Integer> stats = new HashMap<>();
    for (String word : words) {
      Integer oldValue = stats.get(word);
      if (oldValue == null) {
        stats.put(word, 1);
      } else {
        stats.put(word, oldValue + 1);
      }

//      stats.merge(word, 1, Integer::sum);

//      if (stats.containsKey(word)) {
//        Integer oldValue = stats.get(word);
//        stats.put(word, oldValue + 1);
//      } else {
//        stats.put(word, 1);
//      }
    }

    return stats;
  }


}
