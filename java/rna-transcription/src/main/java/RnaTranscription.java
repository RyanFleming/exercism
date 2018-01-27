class RnaTranscription {

  String transcribe(String dnaStrand) {
    StringBuilder rnaStrand = new StringBuilder();
    for (int i = 0; i < dnaStrand.length(); i++) {
      switch (dnaStrand.charAt(i)) {
        case 'G':
          rnaStrand.append('C');
          break;
        case 'C':
          rnaStrand.append('G');
          break;
        case 'T':
          rnaStrand.append('A');
          break;
        case 'A':
          rnaStrand.append('U');
          break;
      }
    }
    return String.valueOf(rnaStrand);
  }
}
