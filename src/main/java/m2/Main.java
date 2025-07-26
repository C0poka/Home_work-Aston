package m2;

import m2.Abstraction.Vehicles;
import m2.Interface.Cargo;
import m2.Vehicles.*;

public class Main {
    public static void main (String[] arges){
        Vehicles[] vehicles= {
                new Airplane(),
                new Boat(),
                new Helicopter(),
                new Tanker(),
                new Taxi(),
                new Truck()
        };
        for (Vehicles vehicless : vehicles){
            vehicless.aName();
            vehicless.property();
            System.out.println();
        }
    };
}
//дз