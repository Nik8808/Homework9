package ru.netology.javaqa;

public class Radio {
    private int volumeLevel;
    private int RadioStationNumber;

    public void nextNewVolumeLevel() {
        if (volumeLevel < 100) {
            volumeLevel += 1;
        } else {
            volumeLevel = 100;
        }
    }

    public void prevNewVolumeLevel() {
        if (volumeLevel > 0) {
            volumeLevel -= 1;
        } else {
            volumeLevel = 0;
        }
    }

    public void lstVolumeLevel() {

        volumeLevel = 100;
    }

    public void nextRadioStationNumber() {
        if (RadioStationNumber < 9) {
            RadioStationNumber += 1;
        } else {
            RadioStationNumber = 0;
        }
    }

    public void prevRadioStationNumber() {
        if (RadioStationNumber > 0) {
            RadioStationNumber -= 1;
        } else {
            RadioStationNumber = 9;
        }
    }

    public void lstRadioStation() {

        RadioStationNumber = 9;
    }

    public int getVolumeLevel() {

        return volumeLevel;
    }

    public void setVolumeLevel(int newVolumeLevel) {
        if (newVolumeLevel < 0) {
            return;
        }
        if (newVolumeLevel > 100) {
            return;
        }
        volumeLevel = newVolumeLevel;
    }


    public int getRadioStationNumber() {

        return RadioStationNumber;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < 0) {
            return;
        }
        if (newRadioStationNumber > 9) {
            return;
        }
        RadioStationNumber = newRadioStationNumber;
    }

}


