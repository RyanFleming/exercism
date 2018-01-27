/*
 * Solution by Ryan Fleming
 * 1/27/18
 * All Rights Reserved
 */

class Hamming {

  private String leftStrand;
  private String rightStrand;

  Hamming(String leftStrand, String rightStrand) {
    if (leftStrand.length() != rightStrand.length()) {
      throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
    }
    this.leftStrand = leftStrand;
    this.rightStrand = rightStrand;
  }

  int getHammingDistance() {

    int counter = 0;
    if (leftStrand.equals(rightStrand)) {
      return counter;
    } else {
      for (int i = 0; i < leftStrand.length(); i++) {
        if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
          counter++;
        }
      }
      return counter;
    }
  }
}
