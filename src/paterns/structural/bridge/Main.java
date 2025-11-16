package paterns.structural.bridge;

import paterns.structural.bridge.logic.devices.Radio;
import paterns.structural.bridge.logic.devices.TV;
import paterns.structural.bridge.logic.remote.AdvanceRemote;
import paterns.structural.bridge.logic.remote.Remote;

public class Main {


    public static void main(String[] args) {

        TV tv = new TV();
        Radio radio = new Radio();

        Remote remote = new Remote(tv);
        AdvanceRemote advanceRemote = new AdvanceRemote(radio);

        remote.powerToggle();
        remote.volumeUp();

        advanceRemote.powerToggle();
        advanceRemote.volumeUp();
        advanceRemote.mute();

    }
}
