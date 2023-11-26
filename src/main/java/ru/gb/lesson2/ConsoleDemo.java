package ru.gb.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleDemo {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите размер массива:");
    int n = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Введите " + n + " чисел через пробел в одну строку: ");

    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }

    System.out.println("Введеный массив: " + Arrays.toString(array));



    // stdin
    // stdout
    // stderr

    // java MyClass.java > output.txt

//    Scanner scanner = new Scanner(System.in);
//
//    int x = scanner.nextInt();
//    int y = scanner.nextInt();
//
//    System.out.println("nextInt() = " + x);
//    System.out.println("nextInt() = " + y);

  }

}
