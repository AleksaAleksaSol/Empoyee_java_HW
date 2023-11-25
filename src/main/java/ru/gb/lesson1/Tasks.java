package ru.gb.lesson1;

public class Tasks {

  public static void main(String[] args) {
    int[][] array = new int[4][4];
    // array = [
    //   [0, 0, 0, 0],
    //   [0, 0, 5, 0],
    //   [0, 0, 0, 0],
    //   [0, 0, 0, 3]
    // ]

    array[1][2] = 5;
    array[3][3] = 3;
    printArray(array);
    System.out.println();

    fillDiagonalElements(array);
    printArray(array);


    int x = 20;
    int y = 4;

    int r = x % y;
    System.out.println(r);

  }

  /**
   *
   */

  /**
   * Метод, который в квадратном массиве все элементы диагоналей заполняет единицами
   */
  static void fillDiagonalElements(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      array[i][i] = 1;
      array[i][array.length - i - 1] = 1;
    }

    // size = 4
    // [0][size - 1]
    // [1][size - 2]
    // [2][size - 3]
    // [3][size - 4]

    // i = [0, size - 1]
    // [i][size - i - 1]
  }

  // array = [
  //   [0, 0, 0, 0],
  //   [0, 0, 5, 0],
  //   [0, 0, 0, 0],
  //   [0, 0, 0, 3]
  // ]

  /**
   * Метод, который печатает массив в виде таблицы
   */
  static void printArray(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }

}
