package optional.e1Classes;

import java.util.Optional;

public class Soundcard {

    private Optional<USB> usb;// In addition, a sound card can optionally have a USB port.
    public Optional<USB> getUSB() { return this.usb; }
}
