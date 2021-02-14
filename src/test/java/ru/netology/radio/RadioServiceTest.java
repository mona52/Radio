package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioServiceTest {

    @Test
    void selectionChannelUpperMax() {
        Radio radio = new Radio();
        int currentChannel = 10;
        int expected = 0;
        RadioService service = new RadioService();
        int actual = service.SelectionChannel(currentChannel, radio.getMaxChannel(), radio.getMinChannel());
        assertEquals(expected, actual);
    }

    @Test
    void selectionChannelBelowMin() {
        Radio radio = new Radio();
        int currentChannel = -1;
        int expected = 9;
        RadioService service = new RadioService();
        int actual = service.SelectionChannel(currentChannel, radio.getMaxChannel(), radio.getMinChannel());
        assertEquals(expected, actual);
    }

    @Test
    void selectionChannelNormal() {
        Radio radio = new Radio();
        int currentChannel = 5;
        int expected = 5;
        RadioService service = new RadioService();
        int actual = service.SelectionChannel(currentChannel, radio.getMaxChannel(), radio.getMinChannel());
        assertEquals(expected, actual);
    }


    @Test
    void selectionVolumeUpperMax() {
        Radio radio = new Radio();
        int currentVolume = 11;
        int expected = 10;
        RadioService service = new RadioService();
        int actual = service.SelectionVolume(currentVolume, radio.getMaxVolume(), radio.getMinVolume());
        assertEquals(expected, actual);
    }

    @Test
    void selectionVolumeBelowMin() {
        Radio radio = new Radio();
        int currentVolume = -1;
        int expected = 0;
        RadioService service = new RadioService();
        int actual = service.SelectionVolume(currentVolume, radio.getMaxVolume(), radio.getMinVolume());
        assertEquals(expected, actual);
    }

    @Test
    void selectionVolumeNormal() {
        Radio radio = new Radio();
        int currentVolume = 7;
        int expected = 7;
        RadioService service = new RadioService();
        int actual = service.SelectionVolume(currentVolume, radio.getMaxVolume(), radio.getMinVolume());
        assertEquals(expected, actual);
    }
}