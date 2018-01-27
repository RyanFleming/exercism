public class PangramChecker {

  public boolean isPangram(String input) {
    String lowerInput = input.toLowerCase();
    return lowerInput.indexOf('a') > -1 && lowerInput.indexOf('b') > -1
        && lowerInput.indexOf('c') > -1 && lowerInput.indexOf('d') > -1
        && lowerInput.indexOf('e') > -1 && lowerInput.indexOf('f') > -1
        && lowerInput.indexOf('g') > -1 && lowerInput.indexOf('h') > -1
        && lowerInput.indexOf('i') > -1 && lowerInput.indexOf('j') > -1
        && lowerInput.indexOf('k') > -1 && lowerInput.indexOf('l') > -1
        && lowerInput.indexOf('m') > -1 && lowerInput.indexOf('n') > -1
        && lowerInput.indexOf('o') > -1 && lowerInput.indexOf('p') > -1
        && lowerInput.indexOf('q') > -1 && lowerInput.indexOf('r') > -1
        && lowerInput.indexOf('s') > -1 && lowerInput.indexOf('t') > -1
        && lowerInput.indexOf('u') > -1 && lowerInput.indexOf('v') > -1
        && lowerInput.indexOf('w') > -1 && lowerInput.indexOf('x') > -1
        && lowerInput.indexOf('y') > -1 && lowerInput.indexOf('z') > -1;
  }
}
