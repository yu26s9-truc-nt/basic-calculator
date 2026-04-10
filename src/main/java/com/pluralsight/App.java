package com.pluralsight;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    double num1 = scanner.nextDouble();

    System.out.print("Enter the second number: ");
    double num2 = scanner.nextDouble();
    scanner.nextLine();

    System.out.print("Possible calculations:\n\t(A)dd\n\t(S)ubtract\n\t(M)ultiply\n\t(D)ivide\nPlease select and option: ");
    String operator = scanner.nextLine();
    String operatorDisplay = "";
    double result = 0.0;

    switch (operator.toUpperCase()) {
      case "A":
        operatorDisplay = "+";
        result = num1 + num2;
        break;
      case "S":
        operatorDisplay = "-";
        result = num1 - num2;
        break;
      case "M":
        operatorDisplay = "*";
        result = num1 * num2;
        break;
      case "D":
        if (num2 == 0) {
          System.out.println("Cannot divide by zero");
          scanner.close();
          return;
        }
        operatorDisplay = "/";
        result = num1 / num2;
        break;
      default:
        System.out.println("Please only choose A, S, M or D for option");
        scanner.close();
        return;
    }

    System.out.printf("%.2f %s %.2f = %.2f\n", num1, operatorDisplay, num2, result);

    scanner.close();
  }
}
