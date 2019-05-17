package optional.e1Classes;

import java.util.Optional;

public class Computer {

    Optional<Computer> Computer(){
        return Optional.of(this);
    }

    private Optional<Soundcard> soundcard = Optional.empty(); // Shows a Computer might or might not have a sound card(the sound card is optional)
    public Optional<Soundcard> getSoundcard() { return this.soundcard; }
}
