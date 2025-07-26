package m2.Vehicles;

import m2.Abstraction.Vehicles;
import m2.Interface.Wheels;

public class Taxi extends Vehicles implements Wheels {
    public void aName() {
        super.aName();
    }

    @Override
    public void property() {
        System.out.println(Wheels.property);
    }
}
