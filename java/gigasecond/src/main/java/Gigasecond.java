import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

  private final LocalDateTime BIRTH_DATE;

  Gigasecond(LocalDate birthDate) {
    BIRTH_DATE = birthDate.atStartOfDay();
  }

  Gigasecond(LocalDateTime birthDateTime) {
    BIRTH_DATE = birthDateTime;
  }

  LocalDateTime getDate() {
    return BIRTH_DATE.plusSeconds(1000000000);
  }
}
