/*
 * Solution by Ryan Fleming
 * 1/27/18
 * All Rights Reserved
 */

class NaturalNumber {

  private double number;

  NaturalNumber(double number) {
    if (number <= 0) {
      throw new IllegalArgumentException("You must supply a natural number (positive integer)");
    }
    this.number = number;
  }

  Classification getClassification() {
    if (number == 1) {
      return Classification.DEFICIENT;
    }
    double aliquotSum = getAliquotSum(number);
    if (aliquotSum == number) {
      return Classification.PERFECT;
    } else if (aliquotSum > number) {
      return Classification.ABUNDANT;
    } else {
      return Classification.DEFICIENT;
    }
  }

  private double getAliquotSum(double number) {
    double aliquotSum = 0;
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        if (i == (number / i)) {
          aliquotSum += i;
        } else {
          aliquotSum += (i + number / i);
        }
      }
    }
    return aliquotSum + 1;
  }
}
