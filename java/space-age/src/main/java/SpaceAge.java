class SpaceAge {

  private final double SECONDS;
  private final double EARTH_SECONDS = 31557600;

  SpaceAge(double seconds) {
    SECONDS = seconds;
  }

  private double getSeconds() {
    return SECONDS;
  }

  double onEarth() {
    return (getSeconds() / EARTH_SECONDS);
  }

  double onMercury() {
    double mercurySeconds = 0.2408467 * EARTH_SECONDS;

    return (getSeconds() / mercurySeconds);
  }

  double onVenus() {
    double venusSeconds = 0.61519726 * EARTH_SECONDS;
    return (getSeconds() / venusSeconds);
  }

  double onMars() {
    double marsSeconds = 1.8808158 * EARTH_SECONDS;
    return (getSeconds() / marsSeconds);
  }

  double onJupiter() {
    double jupiterSeconds = 11.862615 * EARTH_SECONDS;
    return (getSeconds() / jupiterSeconds);
  }

  double onSaturn() {
    double saturnSeconds = 29.447498 * EARTH_SECONDS;
    return (getSeconds() / saturnSeconds);
  }

  double onUranus() {
    double uranusSeconds = 84.016846 * EARTH_SECONDS;
    return (getSeconds() / uranusSeconds);
  }

  double onNeptune() {
    double neptuneSeconds = 164.79132 * EARTH_SECONDS;
    return (getSeconds() / neptuneSeconds);
  }
}
