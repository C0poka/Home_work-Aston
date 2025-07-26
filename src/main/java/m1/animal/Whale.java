package m1.animal;

import m1.Interface.Aquatiq;
import m1.Аbstraction.Mammals;

public class Whale extends Mammals implements Aquatiq {
    @Override
    public void vertebrate() {
        super.vertebrate();
    }

    @Override
    public void liveInWater() {
        System.out.println("Whale "+Aquatiq.str);
    }
}
