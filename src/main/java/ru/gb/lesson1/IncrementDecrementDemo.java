package ru.gb.lesson1;

public class IncrementDecrementDemo {

  public static void main(String[] args) {
    int x = 2;
    int[] array = {10, 20, 30, 40, 50};

    System.out.println("array[--x] = " + array[--x]); // 20 30 40
    System.out.println("x = " + x); // 1

    int sum = 0;
    int i = 0;
    while (i < array.length) {
      sum += array[i++];
    }
    System.out.println(sum);


    x = 5;
  }

}
