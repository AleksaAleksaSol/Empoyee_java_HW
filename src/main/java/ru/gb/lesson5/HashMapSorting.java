package ru.gb.lesson5;

import java.util.*;

public class HashMapSorting {

  public static void main(String[] args) {
    HashMap<Integer, String> hashMap = new HashMap<>();
    TreeMap<Integer, String> treeMap = new TreeMap<>();

    for (int i = 0; i < 100_000; i++) {
      hashMap.put(i, "value");
      treeMap.put(i, "value");

      int order = compareOrder(hashMap, treeMap);
      if (order != -1) {
        System.out.println("Нарушен порядок при добавлении " + i + "-ого элемента");
        System.out.println("Элемент, на котором нарушен порядок: " + order);
        break;
      }
    }
  }

  static int compareOrder(HashMap<Integer, ?> hashMap, TreeMap<Integer, ?> treeMap) {
    Iterator<Integer> hashMapIterator = hashMap.keySet().iterator();
    Iterator<Integer> treeMapIterator = treeMap.keySet().iterator();

    while (hashMapIterator.hasNext() && treeMapIterator.hasNext()) {
      Integer hashMapNext = hashMapIterator.next();
      Integer treeMapNext = treeMapIterator.next();
      if (!Objects.equals(hashMapNext, treeMapNext)) {
        return hashMapNext;
      }
    }

    return -1;
  }

}
