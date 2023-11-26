package ru.gb.lesson2;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringDemo {

  public static void main(String[] args) {
//    equalsDemo();
//    emptyBlank();
//    characters();
//    modification();
//    concatenation();
//    replacement();
//    bytes();
    String s = new String("123413");
    StringBuilder builder = new StringBuilder();
    builder.append(s)
      .append("append")
      .append("\n")
      .append("afads");

    String string = builder.toString();
    System.out.println(string);


  }

  private static void bytes() {
    String string = "My string ыыы ???";
    byte[] bytes = string.getBytes(StandardCharsets.US_ASCII);
    System.out.println(Arrays.toString(bytes));

    String s = new String(bytes, StandardCharsets.US_ASCII);
    System.out.println(s);
  }

  private static void replacement() {
    String text = "my test in       java       in string";
    String[] words = text.split("\\s+");
    System.out.println(Arrays.toString(words));

    String afterReplace =
      text.replaceAll("[(in)(my)]", "");
    System.out.println(afterReplace);

    String email = "igor@mail.com";
    boolean matches = email.matches("([A-Zaz]+)@([A-Zaz]+).([A-Zaz]+)");
    System.out.println(matches);
  }

  private static void contatenation() {
    String string = "My best string";
    boolean contains = string.contains("a best");
    System.out.println(contains);

    int x = string.lastIndexOf('g');
    System.out.println(x);

    boolean startsWith = string.startsWith("My c");
    System.out.println(startsWith);
  }

  private static void modification() {
    // immutable
    String string = "    My best string         ";
    String substring = string.substring(2);
    System.out.println(substring);

    String upperCase = string.toUpperCase();
    System.out.println(upperCase);

    String repeat = string.repeat(5);
    System.out.println(repeat);

    String trim = string.trim();
    System.out.println(trim);
  }

  private static void characters() {
    String string = "My best string";
    char c = string.charAt(4);
    System.out.println(c); //

    char[] charArray = string.toCharArray();
    System.out.println(Arrays.toString(charArray));
    System.out.println(charArray[4]);
  }

  private static void emptyBlank() {
    String string = "   1   ";

    int length = string.length();
    System.out.println(length);

    boolean empty = string.isEmpty();
    boolean blank = string.isBlank(); // whitespace

    System.out.println(empty); // true
    System.out.println(blank); // true
  }

  private static void equalsDemo() {
    String string1 = new String("string"); // -> A
    String string2 = new String("string"); // -> B

    // String Pool [C = "string"]
    String string3 = "string"; // -> C
    String string4 = "string"; // -> C

    boolean equals = string1.equals(string2);
    System.out.println(equals); //
  }

}
