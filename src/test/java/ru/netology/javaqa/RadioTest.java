package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void TestTurningOnTheRadio(){
        Radio cond = new Radio();

        cond.setRadioStationNumber(5);
        int expected = 5;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMaxRadio() {
        Radio cond = new Radio();

        cond.lstRadioStation();

        int expected = 9;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void DoNotSetTheRadioHigherThanTheLast() {
        Radio cond = new Radio();

        cond.setRadioStationNumber(10);
        int expected = 0;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void DoNotSetTheRadioLowerThanTheFirst() {
        Radio cond = new Radio();

        cond.setRadioStationNumber(-1);
        int expected = 0;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void SwitchToTheNextRadioStation() {
        Radio cond = new Radio();
        cond.setRadioStationNumber(5);

        cond.nextRadioStationNumber();

        int expected = 6;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void CheckingTheSwitchToThenextRadioStationAndWhenTheLastOneIsSet() {
        Radio cond = new Radio();
        cond.setRadioStationNumber(9);

        cond.nextRadioStationNumber();

        int expected = 0;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void switchToThePrevRadioStation() {
        Radio cond = new Radio();
        cond.setRadioStationNumber(5);

        cond.prevRadioStationNumber();

        int expected = 4;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void checkingTheSwitchToThePreviousRadioStationAndWhenTheFirstOneIsSet() {
        Radio cond = new Radio();
        cond.setRadioStationNumber(0);

        cond.prevRadioStationNumber();

        int expected = 9;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeTestSetting(){
        Radio cond = new Radio();

        cond.setVolumeLevel(30);
        int expected = 30;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setTheVolumeToMximum() {
        Radio cond = new Radio();

        cond.lstVolumeLevel();

        int expected = 100;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void DoNotSetTheSoundVolumeAboveTheMaximum() {
        Radio cond = new Radio();

        cond.setVolumeLevel(101);
        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void DoNotSetTheSoundVolumeBelowTheMinimum() {
        Radio cond = new Radio();

        cond.setVolumeLevel(-1);
        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TurnUpTheVolume() {
        Radio cond = new Radio();
        cond.setVolumeLevel(5);

        cond.nextNewVolumeLevel();

        int expected = 6;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void RaiseTheMaximumVolumeLevel() {
        Radio cond = new Radio();
        cond.setVolumeLevel(100);

        cond.nextNewVolumeLevel();

        int expected = 100;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void turnDownTheVolume() {
        Radio cond = new Radio();
        cond.setVolumeLevel(5);

        cond.prevNewVolumeLevel();

        int expected = 4;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void turnDownTheMinimumVolume() {
        Radio cond = new Radio();
        cond.setVolumeLevel(0);

        cond.prevNewVolumeLevel();

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
