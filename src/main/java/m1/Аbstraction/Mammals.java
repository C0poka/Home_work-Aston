package m1.Аbstraction;

import m1.Interface.Vertebrate;

public abstract class Mammals extends Animal implements Vertebrate {
    public void vertebrate()
    {
        System.out.println(this.getClass().getSimpleName() + " Mammals has a spine.");
    }
}
//Млекопитающие