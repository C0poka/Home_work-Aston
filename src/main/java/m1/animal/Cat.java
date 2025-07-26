package m1.animal;

import m1.Interface.HasFur;
import m1.Аbstraction.Mammals;

public class Cat extends Mammals implements HasFur {
    @Override
    public void vertebrate() {
        super.vertebrate();
    }
    @Override
    public void hasFur() {
        System.out.println("At the cat's "+HasFur.str);

    }
}
