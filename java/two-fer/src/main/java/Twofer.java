/*
 * Solution by Ryan Fleming
 * 1/27/18
 * All Rights Reserved
 */

class Twofer {

  String twofer(String name) {
    if (name == null) {
      return "One for you, one for me.";
    } else {
      return "One for " + name + ", one for me.";
    }
  }
}
