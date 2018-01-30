/*
* Solution by Ryan Fleming
* 1/29/18
* All Rights Reserved
 */

class Transcriptor {
  toRna(nucleotide: string) {
    let rnaString: string = ""
    for (const aminoAcid of nucleotide) {
      if (aminoAcid === "G") {
        rnaString += "C"
      } else if (aminoAcid === "C") {
        rnaString += "G"
      } else if (aminoAcid === "T") {
        rnaString += "A"
      } else if (aminoAcid === "A") {
        rnaString += "U"
      } else {
        throw new Error("Invalid input DNA.")
      }
    }
    return rnaString
  }
}

export default Transcriptor
