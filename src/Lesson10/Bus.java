package Lesson10;

public class Bus extends Transport {
    private boolean wifi;

    public Bus(String departureSt, String destSt, String num, boolean wifi) {
        super(departureSt, destSt, num);
        this.wifi = wifi;
    }

    public boolean isWiFi(){
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
}
