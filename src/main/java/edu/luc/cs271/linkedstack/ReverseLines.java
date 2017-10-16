package edu.luc.cs271.linkedstack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseLines {

  public static void main(String[] args) {
    // TODO read successive input lines until EOF, then print out in reverse order
    final Scanner input = new Scanner(System.in);
    String line;
    while ((line = input.nextLine()) != null) {
      ReverseLines object = new ReverseLines(line);
      System.out.println(object.reverse());
    }
  }

  private String input;
  private Stack<Character> stack = new Stack<Character>();

  public ReverseLines(String str) {
    input = str;
    fillStack();
  }

  private void fillStack() {
    for (int i = 0; i < input.length(); i++) {
      stack.push(input.charAt(i));
    }
  }

  public String reverse() {
    StringBuilder result = new StringBuilder();
    while (!stack.empty()) {
      result.append(stack.pop());
    }
    return result.toString();
  }
}
