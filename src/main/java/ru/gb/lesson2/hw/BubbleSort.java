package ru.gb.lesson2.hw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class BubbleSort {
  private static File log;
  private static FileWriter fileWriter;

  public static void sort(int[] mas) {
    try {
      log = new File("log.txt");
      fileWriter = new FileWriter(log);

      fileWriter.write(now() + Arrays.toString(mas));
      fileWriter.flush();
      fileWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static String now() {
    return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
  }

}
