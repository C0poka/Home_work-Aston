package m2.Vehicles;

import m2.Abstraction.Vehicles;
import m2.Interface.Cargo;
import m2.Interface.Propeller;


public class Boat extends Vehicles implements Cargo,Propeller {
    public void aName() {
        super.aName();
    }
    @Override
    public void property() {
        System.out.println(Cargo.property+"\n "+Propeller.property);

    }
}
