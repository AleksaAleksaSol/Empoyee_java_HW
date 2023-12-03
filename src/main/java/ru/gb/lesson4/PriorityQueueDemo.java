package ru.gb.lesson4;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

  public static void main(String[] args) {
    // Все языки, начинающиеся с java, были впереди. Остальные - в лексикографическом порядке
    PriorityQueue<String> strings = new PriorityQueue<>(new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        if (o1.toLowerCase().startsWith("java") && !o2.toLowerCase().startsWith("java")) {
          return -1;
        } else if (!o1.toLowerCase().startsWith("java") && o2.toLowerCase().startsWith("java")) {
          return 1;
        }
        return o1.compareTo(o2);
      }
    });

    strings.add("0Java");
    strings.add("java");
    strings.add("jAVa");
    strings.add("JAVASCRIPT");
    strings.add("Java");
    strings.add("Kotlin");
    strings.add("Python");
    strings.add("C++");
    strings.add("JavaScript");
    strings.add("Scala");
    strings.add("Pascal");
    strings.add("Fortran");
    strings.add("Assembler1");
    strings.add("Assembler0");

    System.out.println(strings.poll());
    System.out.println(strings.poll());
    System.out.println(strings.poll());
    System.out.println(strings.poll());
    System.out.println(strings.poll());
    System.out.println(strings.poll());
    System.out.println(strings.poll());
    System.out.println(strings.poll());
    System.out.println(strings.poll());
    System.out.println(strings.poll());

  }

}
