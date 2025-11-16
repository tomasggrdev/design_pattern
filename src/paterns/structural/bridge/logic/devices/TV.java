package paterns.structural.bridge.logic.devices;

public class TV implements Device {

    private boolean isEnabled;
    private int volume;
    private int channel;

    public TV() {
        this.isEnabled = false;
        this.volume = 0;
        this.channel = 0;
    }


    @Override
    public boolean isEnabled() {
        System.out.println( "TV is " + (this.isEnabled ? "enabled" : "disabled"));
        return this.isEnabled;
    }

    @Override
    public void enable() {
        System.out.println("enabling TV");
        this.isEnabled = true;
    }

    @Override
    public void disable() {
        System.out.println("disabling TV");
        this.isEnabled = false;
    }

    @Override
    public int getVolume() {
        System.out.println("TV volume is " + this.volume);
        return this.volume;
    }

    @Override
    public void setVolume(int i) {
        System.out.println("setting TV volume to " + i);
        this.volume = i;
    }

    @Override
    public int getChannel() {
        System.out.println("TV channel is " + this.channel);
        return this.channel;
    }

    @Override
    public void setChannel(int i) {
        System.out.println("setting TV channel to " + i);
        this.channel = i;
    }
}
