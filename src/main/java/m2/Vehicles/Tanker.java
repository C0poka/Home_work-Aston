package m2.Vehicles;

import m2.Abstraction.Vehicles;
import m2.Interface.Cargo;
import m2.Interface.Propeller;

public class Tanker extends Vehicles implements Propeller, Cargo {
    public void aName() {
        super.aName();
    }

    @Override
    public void property() {
        System.out.println(Propeller.property+"\n "+Cargo.property);

    }
}
