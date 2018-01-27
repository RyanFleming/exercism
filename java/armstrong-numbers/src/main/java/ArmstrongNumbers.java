/*
 * Solution by Ryan Fleming
 * 1/27/18
 * All Rights Reserved
 */

class ArmstrongNumbers {

  boolean isArmstrongNumber(int numberToCheck) {
    String numberString = Integer.toString(numberToCheck);
    int numberDigits = numberString.length();
    double comparisonNumber = 0;
    for (int i = 0; i < numberDigits; i++) {
      comparisonNumber += Math
          .pow(Character.getNumericValue(numberString.charAt(i)), (numberDigits));
      System.out.println(comparisonNumber);
    }
    return (numberToCheck == comparisonNumber);
  }
}
