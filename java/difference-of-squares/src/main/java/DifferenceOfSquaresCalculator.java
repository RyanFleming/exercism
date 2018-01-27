/*
 * Solution by Ryan Fleming
 * 1/27/18
 * All Rights Reserved
 */

class DifferenceOfSquaresCalculator {

  int computeSquareOfSumTo(int input) {
    int count = 0;
    for (int i = 1; i <= input; i++) {
      count += i;
    }
    return count * count;
  }

  int computeSumOfSquaresTo(int input) {
    int count = 0;
    for (int i = 1; i <= input; i++) {
      count += (i * i);
    }
    return count;
  }

  int computeDifferenceOfSquares(int input) {
    return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
  }
}
