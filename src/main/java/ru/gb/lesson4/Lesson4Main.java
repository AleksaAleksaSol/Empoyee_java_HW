package ru.gb.lesson4;

import java.util.*;

public class Lesson4Main {

  public static void main(String[] args) {
    // LinkedList, Queue, Deque, PriorityQueue, Stack
//    integers();

    // interface      - List
    // implementation - ArrayList = [1, 2, 3, 4, 5, 6]
    // implementation - LinkedList = null <-> head(1) <-> next(2) <-> next(3) <-> next(4) <-> next(5) <-> tail(6)

    // Stack FirstInLastOut
    // interface Queue FirstInFirstOut add(1), add(2), add(3), add(4), poll() - 1, poll() - 2, poll() - 3, poll() - 4
    // interface Deque addFirst, addLast, getFirst, getLast
    // []
    // addFirst(1) -> [1]
    // addLast(2) -> [1, 2]
    // addFirst(0) -> [0, 1, 2]
    // getFirst -> 0, [1, 2]
    // getLast -> 2, [1]
    //
    // implementation - ArrayDeque = [1, 2, 3, 4, 5, 6]
    // implementation - LinkedList =

    Deque<Integer> list = new ArrayDeque<>();

    list.add(1);
    list.add(4);
    list.add(5);
    list.add(2);
    list.add(3);
    list.add(3);
    list.add(7);

    System.out.println(list); // [1 4 2 3 3 7]
    System.out.println(list.poll()); // 1
    System.out.println(list.poll()); // 4
    System.out.println(list.poll()); // 5

    System.out.println(list.peek()); // 2
    System.out.println(list.peek()); // 2
    System.out.println(list.peek()); // 2

    System.out.println(list.poll()); // 2
    System.out.println(list.poll()); // 3
    System.out.println(list.poll()); // 3
    System.out.println(list.poll()); // 7
    System.out.println(list.poll()); // null
    System.out.println(list.poll()); // null
    System.out.println(list.poll()); // null
    System.out.println(list.poll()); // null
  }

  private static void integers() {
    LinkedList<Integer> linkedList = new LinkedList<>(); // List [10] [1, 2, null, null, null, null, null, null, null, null] position = 2
    System.out.println(linkedList); // []
    System.out.println(linkedList.size()); // 0
    System.out.println("isEmpty() = " + linkedList.isEmpty());

    linkedList.add(1);
    linkedList.add(2);
    System.out.println(linkedList); // [1, 2]
    System.out.println(linkedList.size()); // 2
    System.out.println("isEmpty() = " + linkedList.isEmpty());

    for (int i = 3; i <= 10; i++) {
      linkedList.add(i);
    }
    System.out.println(linkedList); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    System.out.println(linkedList.size()); // 10

    linkedList.add(11);

    Integer integer = linkedList.get(3);
    System.out.println("[3] = " + integer);

    linkedList.set(3, 0);
    System.out.println(linkedList); // [1, 2, 3, 0, 5, 6, 7, 8, 9, 10]

    linkedList.add(2, 100);
    System.out.println(linkedList); // [1, 2, 100, 3, 0, 5, 6, 7, 8, 9, 10]

    LinkedList<Integer> newLinkedList = new LinkedList<>();
    System.out.println(newLinkedList);
    newLinkedList.addAll(linkedList);
    System.out.println(newLinkedList);

    newLinkedList.clear();
    System.out.println(newLinkedList);

    linkedList.remove(2);
    System.out.println(linkedList); // [1, 2, 3, 0, 5, 6, 7, 8, 9, 10]

    linkedList.replaceAll(it -> {
      if (it % 2 == 0) {
        return -1;
      }
      return it;
    });
    System.out.println(linkedList);

    linkedList.removeIf(it -> it == -1);
    System.out.println(linkedList);

    boolean equals = linkedList.equals(newLinkedList);

  }

}
