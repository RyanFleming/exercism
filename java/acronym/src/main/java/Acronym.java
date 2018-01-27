/*
* Solution by Ryan Fleming
* 1/27/18
* All Rights Reserved
 */

class Acronym {

  private final String PHRASE;

  Acronym(String phrase) {
    PHRASE = phrase;
  }

  String get() {
    String phraseUpper = PHRASE.toUpperCase();
    StringBuilder acronym = new StringBuilder();
    acronym.append(phraseUpper.charAt(0));
    for (int i = 0; i < phraseUpper.length(); i++) {
      if (phraseUpper.charAt(i) == ' ' || phraseUpper.charAt(i) == '-') {
        acronym.append(phraseUpper.charAt(i + 1));
      }
    }
    return acronym.toString();
  }
}
