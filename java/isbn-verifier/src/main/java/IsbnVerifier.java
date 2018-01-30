/*
 * Solution by Ryan Fleming
 * 1/29/18
 * All Rights Reserved
 */

import java.util.ArrayList;
import java.util.List;

class IsbnVerifier {

  boolean isValid(String stringToVerify) {
    int firstX = stringToVerify.indexOf('X');
    if (firstX > -1 && stringToVerify.indexOf('X', firstX + 1) > -1) {
      return false;
    }
    List<Integer> isbnArray = new ArrayList<>();
    for (int i = 0; i < stringToVerify.length(); i++) {
      if (stringToVerify.charAt(i) == '1' || stringToVerify.charAt(i) == '2'
          || stringToVerify.charAt(i) == '3' || stringToVerify.charAt(i) == '4'
          || stringToVerify.charAt(i) == '5' || stringToVerify.charAt(i) == '6'
          || stringToVerify.charAt(i) == '7' || stringToVerify.charAt(i) == '8'
          || stringToVerify.charAt(i) == '9' || stringToVerify.charAt(i) == '0') {
        isbnArray.add(Character.getNumericValue(stringToVerify.charAt(i)));
      }
      if (isbnArray.size() == 9 && stringToVerify.charAt(i) == 'X') {
        isbnArray.add(10);
      }
    }
    return (isbnArray.size() == 10 &&
        ((isbnArray.get(0) * 10) + (isbnArray.get(1) * 9) + (isbnArray.get(2) * 8) + (
            isbnArray.get(3) * 7) + (isbnArray.get(4) * 6) + (isbnArray.get(5) * 5) + (
            isbnArray.get(6) * 4) + (isbnArray.get(7) * 3) + (isbnArray.get(8) * 2) + (
            isbnArray.get(9))) % 11 == 0);
  }
}
