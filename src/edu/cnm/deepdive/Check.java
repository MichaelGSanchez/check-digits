package edu.cnm.deepdive;

public class Check {

  private static final String OUTPUT_FORMAT =
      "Input = %d; remainder = %d; digit sum = %d; remainder = %d.%n";
  private static final int MODULUS = 9;

  public static int digitSum(int input) {
    int sum = 0;
    String inStr = "" + input;
    for (char c : inStr.toCharArray()) {
      sum += c - '0';
    }
    return sum;
  }

  public static void main(String[] args) {
    int input = Integer.parseInt(args[0]);
    int sum = digitSum(input);
    System.out.printf(OUTPUT_FORMAT, input, input % MODULUS, sum, sum % MODULUS);
  }




  public static int reducedDigitSum(int input) {

    String stringVariable;

    int varHolder = 0;

    stringVariable = Integer.toString(input);

    for (int i = 0; i < stringVariable.length(); i++) {
      varHolder += stringVariable.charAt(i) - 48;
    }

    stringVariable = Integer.toString(varHolder);
    int[] varHolderArray = new int[stringVariable.length()];
    for (int i = 0; i < stringVariable.length() - 1; i++) {
      varHolderArray[i] = stringVariable.charAt(i) - 48;
    }

    if (varHolder > 9) {
      for (int i = 0; i < varHolderArray.length - 2; i++) {
        varHolderArray[0] += varHolderArray[i];
      }

    }
    return varHolder;
  }
}


