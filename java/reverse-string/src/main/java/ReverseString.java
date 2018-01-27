/*
 * Solution by Ryan Fleming
 * 1/27/18
 * All Rights Reserved
 */

class ReverseString {

  String reverse(String inputString) {
    if (inputString.equals("")) {
      return inputString;
    } else {
      StringBuilder newString = new StringBuilder();
      for (int i = inputString.length() - 1; i >= 0; i--) {
        newString.append(inputString.charAt(i));
      }
      return String.valueOf(newString);
    }
  }
}