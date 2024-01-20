

package POO;

public class Reloj {

    private int hours;
    private int minutes;
    private int seconds;
    private final int PORDEFECTO = 0;


    public Reloj() {
      this.hours = PORDEFECTO;
      this.minutes = PORDEFECTO;
      this.seconds = PORDEFECTO;
  }

  public Reloj(int hours, int minuts) {
    if (hours < 0 || hours >= 24) {
        throw new IllegalArgumentException("La hora debe estar entre 0 y 23");
    }
    if (minutes < 0 || minutes >= 60) {
        throw new IllegalArgumentException("Los minutos deben estar entre 0 y 59");
    }
      this.hours = hours;
      this.minutes = minuts;
      this.seconds = PORDEFECTO;
  }

    public Reloj(int hours, int minutes, int seconds) {
        if (hours < 0 || hours >= 24) {
            throw new IllegalArgumentException("La hora debe estar entre 0 y 23");
        }
        if (minutes < 0 || minutes >= 60) {
            throw new IllegalArgumentException("Los minutos deben estar entre 0 y 59");
        }
        if (seconds < 0 || seconds >= 60) {
            throw new IllegalArgumentException("Los segundos deben estar entre 0 y 59");
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours < 0 || hours >= 24) {
            throw new IllegalArgumentException("La hora debe estar entre 0 y 23");
        }
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes >= 60) {
            throw new IllegalArgumentException("Los minutos deben estar entre 0 y 59");
        }
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds >= 60) {
            throw new IllegalArgumentException("Los segundos deben estar entre 0 y 59");
        }
        this.seconds = seconds;
    }

    public void incrementTime(int seconds) {
        this.seconds += seconds;
        while (this.seconds >= 60) {
            this.seconds -= 60;
            this.minutes++;
        }
        while (this.minutes >= 60) {
            this.minutes -= 60;
            this.hours++;
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
