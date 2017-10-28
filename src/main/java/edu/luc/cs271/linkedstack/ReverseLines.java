package edu.luc.cs271.linkedstack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseLines {
  public static void main(final String[] args) {
    final Scanner input = new Scanner(System.in);
    printReverse(input);
  }

  private static void printReverse(final Scanner input) {
    // TODO recursively read and print successive input lines until EOF, then print them out in
    // reverse order
    String str = input.nextLine();
    Stack<String> stack = new Stack<>();
    stack.push(str);
    System.out.println(str);
    if (input.hasNext()) {
      printReverse(input);
    }
    System.out.println(stack.pop());
  }
}
