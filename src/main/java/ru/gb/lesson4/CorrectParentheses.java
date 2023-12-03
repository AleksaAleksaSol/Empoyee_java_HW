package ru.gb.lesson4;

import java.util.Deque;
import java.util.LinkedList;

public class CorrectParentheses {

  public static void main(String[] args) {
    checkCorrectParenthesesAndPrint("()()");
    checkCorrectParenthesesAndPrint("(())");
    checkCorrectParenthesesAndPrint(")(");
    checkCorrectParenthesesAndPrint("())");
    checkCorrectParenthesesAndPrint(")(())(");
    checkCorrectParenthesesAndPrint("((((");
  }

  static void checkCorrectParenthesesAndPrint(String sequence) {
    System.out.println(sequence + " -> " + isCorrectParentheses(sequence));
  }

  // Необходимо определить, является ли последовательность скобочек корректной.
  // (()) -> true
  // ()() -> true
  // (() -> false
  // )(())( -> false
  // ((((
  static boolean isCorrectParentheses(String sequence) {
    if (sequence.length() == 0) {
      return true;
    } else if (sequence.length() % 2 != 0) {
      return false;
    }

    Deque<Character> parentheses = new LinkedList<>();
    for (int i = 0; i < sequence.length(); i++) {
      char symbol = sequence.charAt(i);
      if (symbol == '(') {
        parentheses.addLast(symbol);
      } else {
        if (parentheses.isEmpty()) {
          return false;
        } else {
          parentheses.removeLast();
        }
      }
    }
    return parentheses.isEmpty();
  }

}
