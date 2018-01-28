class Proverb {

  private final String[] proverb;

  Proverb(String[] words) {
    proverb = words;
  }

  String recite() {
    if (proverb.length <= 0) {
      return "";
    } else {
      String lastLine = "And all for the want of a " + proverb[0] + ".";
      if (proverb.length == 1) {
        return lastLine;
      } else {
        StringBuilder fullProverb = new StringBuilder();
        for (int i = 0; i < proverb.length - 1; i++) {
          fullProverb.append("For want of a ").append(proverb[i]).append(" the ")
              .append(proverb[i + 1]).append(" was lost.\n");
        }
        return fullProverb + lastLine;
      }
    }
  }
}
