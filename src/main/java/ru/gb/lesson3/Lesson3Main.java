package ru.gb.lesson3;

import java.util.ArrayList;
import java.util.Arrays;

public class Lesson3Main {

  public static void main(String[] args) {
    integers();
//    strings();


    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 5, 1, 2, 2, 1, 6, 2, 3, 5));

    Integer[] arr = new Integer[0];
    Integer[] array = list.toArray(arr);

    System.out.println(Arrays.toString(array));

  }

  private static void integers() {
    ArrayList<Integer> arrayList = new ArrayList<>(); // List [10] [1, 2, null, null, null, null, null, null, null, null] position = 2
    System.out.println(arrayList); // []
    System.out.println(arrayList.size()); // 0
    System.out.println("isEmpty() = " + arrayList.isEmpty());

    arrayList.add(1);
    arrayList.add(2);
    System.out.println(arrayList); // [1, 2]
    System.out.println(arrayList.size()); // 2
    System.out.println("isEmpty() = " + arrayList.isEmpty());

    for (int i = 3; i <= 10; i++) {
      arrayList.add(i);
    }
    System.out.println(arrayList); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    System.out.println(arrayList.size()); // 10

    arrayList.add(11);

    Integer integer = arrayList.get(3);
    System.out.println("[3] = " + integer);

    arrayList.set(3, 0);
    System.out.println(arrayList); // [1, 2, 3, 0, 5, 6, 7, 8, 9, 10]

    arrayList.add(2, 100);
    System.out.println(arrayList); // [1, 2, 100, 3, 0, 5, 6, 7, 8, 9, 10]

    ArrayList<Integer> newArraylist = new ArrayList<>();
    System.out.println(newArraylist);
    newArraylist.addAll(arrayList);
    System.out.println(newArraylist);

    newArraylist.clear();
    System.out.println(newArraylist);

    arrayList.remove(2);
    System.out.println(arrayList); // [1, 2, 3, 0, 5, 6, 7, 8, 9, 10]

    arrayList.replaceAll(it -> {
      if (it % 2 == 0) {
        return -1;
      }
      return it;
    });
    System.out.println(arrayList);

    arrayList.removeIf(it -> it == -1);
    System.out.println(arrayList);

  }

  private static void strings() {
    ArrayList<String> strings = new ArrayList<>();
    strings.add("Java");
    strings.add("Python");
    strings.add("C++");
    strings.add("Golang");
    strings.add("C#");
    strings.add("Kotlin");
    System.out.println(strings);

    boolean assemblerHasRemoved = strings.remove("Assembler");
    System.out.println(assemblerHasRemoved);
    String cSharp = "C#";
    System.out.println(strings.contains(cSharp));
    boolean cSharpHasRemoved = strings.remove(cSharp);
    String remove = strings.remove(4);
    System.out.println(cSharpHasRemoved);
    System.out.println(strings);
    System.out.println(strings.contains(cSharp));

    ArrayList<String> newStrings = new ArrayList<>();
    newStrings.add("Java");
    newStrings.add("Python");
    newStrings.add("Assembler");

    System.out.println(strings.containsAll(newStrings));
  }

}
