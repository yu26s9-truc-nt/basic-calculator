package com.pluralsight;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int num1 = scanner.nextInt();

    System.out.print("Enter the second number: ");
    int num2 = scanner.nextInt();

    System.out.print("Possible calculations:\n\t(A)dd\n\t(S)ubtract\n\t(M)ultiply\n\t(D)ivide\nPlease select and option: ");
    char operator = scanner.next().charAt(0);

    switch (operator) {
      case 'A':
        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        break;
      case 'S':
        System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
        break;
      case 'M':
        System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
        break;
      case 'D':
        System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
        break;
      default:
        System.out.println("Please only choose A, S, M or D for option");
    }

    scanner.close();
  }
}
