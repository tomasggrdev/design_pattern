package paterns.structural.bridge.logic.remote;

import paterns.structural.bridge.logic.devices.Device;

public class Remote {

    protected final Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void powerToggle() {
        if (device.isEnabled()) {
            device.disable();
            return;
        }

        device.enable();

    };

    public void volumeUp() {
        device.setVolume(device.getVolume() + 1);
    };

    public void volumeDown() {
        device.setVolume(device.getVolume() - 1);
    };

    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    };

    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
    };

}
