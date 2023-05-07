package ru.netology.javaqa;

public class Radio {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    public int getCurrentVolume() {
        return currentVolume;
    }
    public int getMaxVolume() {
        return maxVolume;
    }
    public int getMinVolume() {
        return minVolume;
    }
    public void setVolumeLevel(int newVolumeLevel) {
        if (newVolumeLevel < minVolume) {
            return;
        }
        if (newVolumeLevel > maxVolume) {
            return;
        }
        currentVolume = newVolumeLevel;
    }
    public void nextNewVolumeLevel() {
        if (currentVolume < 100) {
            currentVolume += 1;
        }
        else  {
            currentVolume = 100;
        }
    }
    public void prevNewVolumeLevel() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        }
        else {
            currentVolume = 0;
        }
    }
        public void lstVolumeLevel() {

            currentVolume = maxVolume;
        }
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStation;
    private int quantity = 10;
    public Radio(int quantity) {
        this.quantity = quantity;
        this.maxRadioStation = quantity - 1;
        this.minRadioStation = 0;
    }
    public Radio() {
    }
    public int getCurrentRadioStation() {
            return currentRadioStation;
    }
    public int getMaxRadioStation() {
        return maxRadioStation;
    }
    public int getMinRadioStation() {
        return minRadioStation;
    }
    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < minRadioStation) {
            return;
        }
        if (newRadioStationNumber > maxRadioStation) {
            return;
        }
        currentRadioStation = newRadioStationNumber;
    }
    public void nextRadioStationNumber() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation += 1;
        }
        else  {
            currentRadioStation = minRadioStation;
        }
    }
    public void prevRadioStationNumber() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation -= 1;
        }
        else {
            currentRadioStation = maxRadioStation;
        }
    }
    public void lstRadioStation() {

        currentRadioStation = maxRadioStation;
    }
}


