package homework_6;

public class TV {

	int channel = 1;
    int volumeLevel = 1;
    boolean on = false;
    public TV(){
    }
    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }
    public void setChannel(int newChannel){
        if (on && newChannel >= 1 && newChannel <= 120)
            channel = newChannel;
    }
    public void setVolumeLevel(int newVolumnLevel){
        if (on && newVolumnLevel >= 1 && newVolumnLevel <= 7)
            volumeLevel = newVolumnLevel;
    }
    public void channelUp(){
        if (on && channel < 120)
            channel++;
    }
    public void channelDown(){
        if (on && channel > 1)
            channel--;
    }
    public void volumnUp(){
        if (on && volumeLevel < 7)
            volumeLevel++;
    }
    public void volumnDowm(){
        if (on && volumeLevel > 1)
            volumeLevel--;
    }


}
