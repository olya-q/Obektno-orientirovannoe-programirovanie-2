import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Radio2Test {
    @Test
    public void valueInRange() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upperRangeLimit() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(29);

        int expected = 29;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowerRangeLimit() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}

