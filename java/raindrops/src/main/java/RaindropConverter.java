class RaindropConverter {

  String convert(int number) {
    String rainString = "";
    if (number % 3 == 0) {
      rainString += "Pling";
    }
    if (number % 5 == 0) {
      rainString += "Plang";
    }
    if (number % 7 == 0) {
      rainString += "Plong";
    }
    if (rainString.equals("")) {
      rainString = Integer.toString(number);
    }
    return rainString;
  }
}
