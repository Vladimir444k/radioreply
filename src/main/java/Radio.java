public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation == 0) {
            currentStation = 9;
            return;
        }
        this.currentStation = currentStation + 1;
    }

    public void prevStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }

        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == 100) {
            currentVolume -= 1;
        }
    }
}
