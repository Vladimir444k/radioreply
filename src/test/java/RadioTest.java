import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationOutOfRange() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationMinOfRange() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.nextStation();

        int expected = 9;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        radio.prevStation();

        int expected = 0;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldMaxStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.nextStation();

        int expected = 9;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldMinStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.prevStation();

        int expected = 0;

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldVolumeUp() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int expected = 1;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldVolumeDown() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.decreaseVolume();

        int expected = 99;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldVolumeIsMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldVolumeIsMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(101);

        int expected = 0;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}