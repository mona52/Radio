package ru.netology.radio;


public class Radio {
    private int maxChannel = 9;
    private int minChannel = 0;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentChannel = 5;
    private int currentVolume = 7;

    public int getMaxChannel() {
        return maxChannel;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public boolean isOn() {
        return on;
    }



    private boolean on;

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }




    public static void main(String[] args) {
            Radio radio = new Radio();
            RadioService service1 = new RadioService();
            int currentChannel1 = service1.SelectionChannel(radio.getCurrentChannel(), radio.getMaxChannel(), radio.getMinChannel());
            int currentVolume1 = service1.SelectionVolume(radio.getCurrentVolume(), radio.getMaxVolume(), radio.getMinVolume());
            radio.setCurrentChannel(currentChannel1);
            radio.setCurrentVolume(currentVolume1);

            System.out.println("Выбран радиоканал № " + radio.getCurrentChannel());
            System.out.println("Установлен уровень звука - " + radio.getCurrentVolume());

        }
    }


