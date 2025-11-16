package paterns.structural.bridge.logic.remote;

import paterns.structural.bridge.logic.devices.Device;

public class AdvanceRemote extends Remote {

    public AdvanceRemote(Device device) {
        super(device);
    }

    public void mute() {
        this.device.setVolume(0);
    }
}
