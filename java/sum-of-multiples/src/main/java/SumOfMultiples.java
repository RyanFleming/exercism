/*
 * Solution by Ryan Fleming
 * 1/30/18
 * All Rights Reserved
 */

import java.util.ArrayList;
import java.util.List;

class SumOfMultiples {

  private final int[] SET;
  private final int NUMBER;

  SumOfMultiples(int number, int[] set) {
    NUMBER = number;
    SET = set;
  }

  int getSum() {
    if (NUMBER == 1) {
      return 0;
    }
    List<Integer> sumArray = new ArrayList<>();
    for (int aSET : SET) {
      for (int j = 1; j < NUMBER; j++) {
        if (j % aSET == 0 && !sumArray.contains(j)) {
          sumArray.add(j);
        }
      }
    }
    return sumArray.stream().mapToInt(Integer::intValue).sum();
  }
}
