package m2.Vehicles;

import m2.Abstraction.Vehicles;
import m2.Interface.Cargo;
import m2.Interface.Propeller;
import m2.Interface.Wheels;

public class Helicopter extends Vehicles implements Cargo, Propeller, Wheels {
    public void aName() {
        super.aName();
    }
    @Override
    public void property() {
        System.out.println(Cargo.property+"\n "+Propeller.property+"\n "+Wheels.property);
    }
}
