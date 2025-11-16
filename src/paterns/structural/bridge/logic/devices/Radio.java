package paterns.structural.bridge.logic.devices;

public class Radio implements Device {

    private boolean isEnabled;
    private int volume;
    private int channel;

    public Radio() {
        this.isEnabled = false;
        this.volume = 0;
        this.channel = 0;
    }


    @Override
    public boolean isEnabled() {
        System.out.println( "Radio is " + (this.isEnabled ? "enabled" : "disabled"));
        return this.isEnabled;
    }

    @Override
    public void enable() {
        System.out.println("enabling radio");
        this.isEnabled = true;
    }

    @Override
    public void disable() {
        System.out.println("disabling radio");
        this.isEnabled = false;
    }

    @Override
    public int getVolume() {
        System.out.println("Radio volume is " + this.volume);
        return this.volume;
    }

    @Override
    public void setVolume(int i) {
        System.out.println("setting Radio volume to " + i);
        this.volume = i;
    }

    @Override
    public int getChannel() {
        System.out.println("Radio channel is " + this.channel);
        return this.channel;
    }

    @Override
    public void setChannel(int i) {
        System.out.println("setting Radio channel to " + i);
        this.channel = i;
    }
}
