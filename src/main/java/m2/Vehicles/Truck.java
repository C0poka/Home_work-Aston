package m2.Vehicles;

import m2.Abstraction.Vehicles;
import m2.Interface.Cargo;
import m2.Interface.Wheels;

public class Truck extends Vehicles implements Cargo, Wheels {
    public void aName() {
        super.aName();
    }

    @Override
    public void property() {
        System.out.println(Cargo.property+"\n "+Wheels.property);
    }
}
