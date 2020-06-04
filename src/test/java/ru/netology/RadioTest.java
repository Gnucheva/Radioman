package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio music = new Radio();

    @Test
    void setCurrentStationValid() {
        music.setOn(true);
        music.setCurrentStation(5);
        assertEquals(5, music.getCurrentStation());


    }

    @Test
    void setCurrentStationInvalidMax() {
        music.setOn(true);
        music.setCurrentStation(10);
        assertEquals(9, music.getCurrentStation());

    }

    @Test
    void setCurrentStationInvalidMin() {
        music.setOn(true);
        music.setCurrentStation(-1);
        assertEquals(0, music.getCurrentStation());


    }

    @Test
    void setCurrentStationIncreaseValid() {
        music.setOn(true);
        music.setCurrentStation(5);
        music.increaseStation();
        assertEquals(6, music.getCurrentStation());


    }

    @Test
    void setCurrentStationIncreaseValidMax() {
        music.setOn(true);
        music.setCurrentStation(9);
        music.increaseStation();
        assertEquals(0, music.getCurrentStation());

    }

    @Test
    void setCurrentStationDecreaseValid() {
        music.setOn(true);
        music.setCurrentStation(5);
        music.decreaseStation();
        assertEquals(4, music.getCurrentStation());


    }

    @Test
    void setCurrentStationDecreaseValidMin() {
        music.setOn(true);
        music.setCurrentStation(0);
        music.decreaseStation();
        assertEquals(9, music.getCurrentStation());

    }

    @Test
    void setCurrentVolume() {
        music.setOn(true);
        music.setCurrentVolume(5);
        assertEquals(5, music.getCurrentVolume());

    }

    @Test
    void setCurrentVolumeInvalidMax() {
        music.setOn(true);
        music.setCurrentVolume(11);
        assertEquals(10, music.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeInvalidMin() {
        music.setOn(true);
        music.setCurrentVolume(-1);
        assertEquals(0, music.getCurrentVolume());
    }


    @Test
    void setCurrentVolumeIncreaseMax() {
        music.setOn(true);
        music.setCurrentVolume(10);
        music.increaseVolume();
        assertEquals(10, music.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeIncrease() {
        music.setOn(true);
        music.setCurrentVolume(5);
        music.increaseVolume();
        assertEquals(6, music.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeDecrease() {
        music.setOn(true);
        music.setCurrentVolume(5);
        music.decreaseVolume();
        assertEquals(4, music.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeDecreaseMin() {
        music.setOn(true);
        music.setCurrentVolume(0);
        music.decreaseVolume();
        assertEquals(0, music.getCurrentVolume());
    }


}