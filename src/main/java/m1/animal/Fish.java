package m1.animal;

import m1.Аbstraction.Animal;
import m1.Interface.Aquatiq;

public class Fish extends Animal implements Aquatiq {

    public void getName() {
        super.getName();
    }

    @Override
    public void liveInWater() {
        System.out.println("Fish "+Aquatiq.str);

    }
}

