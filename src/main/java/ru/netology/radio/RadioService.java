package ru.netology.radio;

public class RadioService {


       // выбор радиоканала
        public int SelectionChannel (int currentChannel, int maxChannel, int minChannel)  {
                int currentChannel1 = currentChannel;
                // если пользователь выбрал канал, следующим за 9-м (максимальным),
                // то присваиваем переменной currentChannel минимальное значение
                if (currentChannel > maxChannel) {
                        currentChannel1 = minChannel;
                }
                // если пользователь выбрал канал, предстоящим перед 0-м (минимальным),
                // то присваиваем переменной currentChannel максимальное значение
                if (currentChannel < minChannel) {
                        currentChannel1 = maxChannel;
                }
                        return currentChannel1;
        }

        // регулировка громкости
        public int SelectionVolume (int currentVolume, int maxVolume, int minVolume)  {
                int currentVolume1 = currentVolume;

                // если пользователь выбрал уровень звука выше максимального, то оставляем максимальное значение
                if (currentVolume > maxVolume) {
                        currentVolume1 = maxVolume;
                }

                // если пользователь выбрал уровень звука ниже минимального, то оставляем минимальное значение
                if (currentVolume < minVolume) {
                        currentVolume1 = minVolume;
                }

                return currentVolume1;
        }
}
