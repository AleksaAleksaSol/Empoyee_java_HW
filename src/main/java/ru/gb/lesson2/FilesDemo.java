package ru.gb.lesson2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class FilesDemo {

  public static void main(String[] args) throws IOException {
    // InputStream OutputStream
    // Reader Writer

//    inputStream();
//    outputStream();
//    bos();
//    copy();
//    path();

    FileWriter fileWriter = new FileWriter(new File("out.txt"));
    // 2023-05-19 07:53 [4, 8, 3, 1, 9]
    String nowString = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

    int[] array = {1, 2, 3, 4,5};
    fileWriter.write(nowString + " " + Arrays.toString(array));
    fileWriter.flush();

    Path input = Path.of("input.txt");
    Path output = Path.of("output.txt");

    // Checked Unchecked
//    try {
//      copy(input, output);
//    } catch (IOException e) {
//      System.out.println("Произошла ошибка при копировании: " + e.getMessage());
//      e.printStackTrace();
//    }

    System.out.println("adsfadsf");


  }

  private static void copy(Path from, Path to) throws IOException {
    Files.copy(from, to);
  }

  private static void path() {
    Path path = Path.of("dir", "child", "file.txt");

    boolean exists = Files.exists(path);
    System.out.println(exists);

    boolean regularFile = Files.isRegularFile(path);
    boolean directory = Files.isDirectory(path);
    System.out.println(regularFile); // true
    System.out.println(directory);   // false
  }

  private static void copy() throws IOException {
    byte[] bytes = null;
    try (FileInputStream fis = new FileInputStream(new File("input.txt"))) {
      bytes = fis.readAllBytes();
    }

    FileOutputStream fos = new FileOutputStream(new File("output.txt"));
    fos.write(bytes);
    fos.close();
  }

  private static void bos() throws IOException {
    BufferedOutputStream bos = new BufferedOutputStream(System.out);
    bos.write("abcd".getBytes());
    bos.write("efg".getBytes());
    bos.write("hijk".getBytes());
    bos.flush();
  }

  private static void outputStream() throws IOException {
    OutputStream out = System.out;
    String output = "abcde";
    byte[] bytes = output.getBytes();
    out.write(bytes);
  }

  private static void inputStream() throws IOException {
    InputStream in = System.in;

    byte[] input = new byte[2048]; // 2KB
    int result = in.read(input); // 17B
    byte[] stringBytes = new byte[result];
    for (int i = 0; i < result; i++) {
      stringBytes[i] = input[i];
    }
    String string = new String(stringBytes);
    System.out.println(string);
  }

}
