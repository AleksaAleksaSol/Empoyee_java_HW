package ru.gb.lesson5;

import java.util.*;

public class Lesson5Main {

  public static void main(String[] args) {
    // HashMap, TreeMap, LinkedHashMap
//    basic();
//    hashmap();

    LinkedHashMap<String, Integer> stringsMap = new LinkedHashMap<>();
    stringsMap.put("Java", 4);
    stringsMap.put("Kotlin", 6);
    stringsMap.put("C++", 3);
    stringsMap.put("Python", 6);
    System.out.println(stringsMap);

    stringsMap.get("Java");

  }

  private static void hashmap() {
    // [[0], [1], [2], [3] = [(key1, value1), (key2, value2)], [4], ...,  [15]] - hashtable
    // initialCapacity = 16
    HashMap<String, String> stringsMap = new HashMap<>();

    String key = "Kotlin";
//    String key = "String";
    System.out.println("key = " + key);

    int hash = key.hashCode();
    System.out.println("Original hash = " + hash);
    if (hash < 0) {
      hash = -hash;
    }
    hash = hash % 16;
    System.out.println("Bucket = " + hash);

    hash = hash ^ (hash >>> 16);
    System.out.println("Actual bucket = " + hash);


    stringsMap.put("key", "value");
    // 1. key -> hash(key) = hash = 18
    // 2. hash -> [i] = [2]
    // 2.1 if (0 <= i <= 15) => [i]
    // 2.2 if (i > 15) => i % 16
    // 3. Нашли ячейку для вставки [i]
    // 4. В этой ячейке лежит список. Итерируемся по нему и смотрим, что такого ключа еще нет (с помощью equals)
    // 4.1 Если такой ключ уже есть, то меняем его значение
    // 4.2 Если такого ключа нет, то дописываем пару в конец списка (коллизия)

    stringsMap.get("key");
    // 1. key -> hash(key) = 18
    // 2. Нашли ячейку для поиске [18]
    // 3. Итерируемся по списку, ищем ключи, которые равны с key по equals
    // 4.1 Если нашли, возвращаем значение
    // 4.2 Если не нашли, возвращаем null
  }

  private static void basic() {
    // Map <key, value>
    // put(key, value);
    // Integer value = get(key);
    // contains(key)
    // remove(key)
    // isEmpty, size, ...
    // keySet(), values(), entrySet(), ...

    HashMap<String, Integer> stringsMap = new HashMap<>();
    System.out.println(stringsMap); // {}

    stringsMap.put("Java", 4);
    stringsMap.put("Kotlin", 6);
    stringsMap.put("C++", 3);
    stringsMap.put("Python", 6);
    System.out.println(stringsMap);

    System.out.println(stringsMap.containsKey("Java")); // true
    stringsMap.remove("Python");
    System.out.println(stringsMap);

    System.out.println(stringsMap.isEmpty()); // false
    System.out.println(stringsMap.size()); // 3

    System.out.println(stringsMap.get("Kotlin")); // 6

    Set<String> keys = stringsMap.keySet();
    Collection<Integer> values = stringsMap.values();
  }

}
