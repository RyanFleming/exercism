/*
 * Solution by Ryan Fleming
 * 1/27/18
 * All Rights Reserved
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

  List<Signal> calculateHandshake(int number) {
    List<Signal> handShakeList = new ArrayList<>();
    String binaryNumber = new StringBuffer(Integer.toBinaryString(number)).reverse().toString();
    if (binaryNumber.length() >= 1 && binaryNumber.charAt(0) == '1') {
      handShakeList.add(Signal.WINK);
    }
    if (binaryNumber.length() >= 2 && binaryNumber.charAt(1) == '1') {
      handShakeList.add(Signal.DOUBLE_BLINK);
    }
    if (binaryNumber.length() >= 3 && binaryNumber.charAt(2) == '1') {
      handShakeList.add(Signal.CLOSE_YOUR_EYES);
    }
    if (binaryNumber.length() >= 4 && binaryNumber.charAt(3) == '1') {
      handShakeList.add(Signal.JUMP);
    }
    if (binaryNumber.length() >= 5 && binaryNumber.charAt(4) == '1') {
      Collections.reverse(handShakeList);
    }
    return handShakeList;
  }
}
