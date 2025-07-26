package m1;

import m1.Interface.Aquatiq;
import m1.Interface.HasFur;
import m1.animal.Bear;
import m1.animal.Cat;
import m1.animal.Fish;
import m1.animal.Whale;
import m1.Аbstraction.Animal;
import m1.Аbstraction.Mammals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Bear(),
                new Whale(),
                new Fish()
        };

        for (Animal animal : animals) {
            animal.getName();

            if (animal instanceof Mammals mammals ) {
                mammals.vertebrate();
            }


            if (animal instanceof HasFur hasFur) {
                hasFur.hasFur();
            }

            if (animal instanceof Aquatiq aquatic) {
                aquatic.liveInWater();
            }

            System.out.println();
        }
    }

}
