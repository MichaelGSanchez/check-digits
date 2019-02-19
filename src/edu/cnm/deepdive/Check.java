package edu.cnm.deepdive;

import java.util.Scanner;
import javafx.scene.transform.Scale;

public class Check {

  public static int digitSum(int a) {

    String b;
    int c = 0;
    b = Integer.toString(a);
    for (int i = 0; i < b.length(); i++) {
      c += b.charAt(i) - 48;
    }
    return c;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number:");
    int a = scanner.nextInt();
    Check.digitSum(a);
    System.out.println(digitSum(a));
    System.out.println(digitSum(a) / 9);
    System.out.println(digitSum(a));
    System.out.println(digitSum(a) / 9);
  }
}


