package optional;


import optional.e1Classes.Computer;
import optional.e1Classes.Soundcard;
import optional.e1Classes.USB;

import java.util.Optional;

public class E1Optional {


    public static void main(String[] args) {

        /*Optional optional = null;
        Optional.of(optional);
        optional = Optional.empty();
        Optional.of(optional);*/


        Computer computer = new Computer();
        // Why we don't use map instead of flat map? because in the implementation of map it is static and you
        // cannot reference non-static methods from static context.
        /*String name = computer.getSoundcard()
//                .flatMap(Computer::getSoundcard)
                .flatMap(Soundcard::getUSB)
                .map(USB::getVersion).orElse("sdf");*/

        Optional<Soundcard> soundcardOptional = computer.getSoundcard();

        Optional<USB> optionalUSB = soundcardOptional.flatMap(Soundcard::getUSB);

        String usbVersion = optionalUSB.map(USB::getVersion).orElse("d");

        /*String name = computer.flatmap(Computer::getSoundcard)
                .flatMap(Soundcard::getUSB)
                .map(USB::getVersion)
                .orElse("UNKNOWN");*/

        System.out.println(usbVersion);


    }
}
