package ru.gb.lesson1;

import java.util.Arrays;

public class Lesson1Main {

  // ctrl + alt + L
  // integrated development environment
  // jetbrains
  public static void main(String[] args) {
    int[] arr = {1, 2, 8, 4, 5};
    System.out.println(findMax(arr));

    int[] empty = {};
    System.out.println(empty.length);   // 0
    System.out.println(findMax(empty)); // ???

    int[] arr2 = {1, 2, 2, 4, 2, 1, 5, 5, 2, 3, 4, 5, 2};
    int occurrences = findOccurrences(arr2, 2);
    System.out.println("Количество \"5\" в массиве " + Arrays.toString(arr2) + ": " + occurrences);

    int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    replace(arr3, 5);
//     arr3 = {0, 0, 0, 0, 5, 6, 7, 8, 9, 10}
    System.out.println(Arrays.toString(arr3));

    int[] arr4 = {3, 3, 3};
    replace(arr4, 4);
    System.out.println(Arrays.toString(arr4));
  }

  /**
   * Написать метод, который принимает массив целых чисел и какое-то целое число target.
   * Необходимо все элементы массива, меньшие target, заменить на 0.
   */
  static void replace(int[] array, int target) {
    int i = 0;
    while (i < array.length) {
      if (array[i] < target) {
        array[i] = 0;
      }
      i++;
    }
//    for (int i = 0; i < array.length; i++) {
//      if (array[i] < target) {
//        array[i] = 0;
//      }
//    }
  }

  /**
   * написать метод, который принимает массив целых чисел и какое-то целое число target.
   * необходимо найти количество чисел в массиве, равных target.
   */
  static int findOccurrences(int[] array, int target) {
    int counter = 0;
    for (int x: array) {
      if (x == target) {
        counter++;
      }
    }
    return counter;

//    for (int i = 0; i < array.length; i++) {
//      int x = array[i]
//      if (x == target) {
//        counter = counter + 1;
//        counter += 1;
//        counter++;
//      }
//    }
//    return counter;
  }

  // написать метод, который находит максимальный элемент в массиве
  public static int findMax(int[] array) {
    if (array.length == 0) {
      System.err.println("Невозможно вычислить максимальный элемент в массиве. Результат будет равен -1");
      return -1;
    }

    int max = array[0];
    for (int i = 1; i < array.length; i++) {
      if (max < array[i]) {
        max = array[i];
      }
    }
    return max;
  }

}
