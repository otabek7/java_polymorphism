package day59_polymorphism;

public class AnimalShow {
    public static void main(String[] args) {
        Animal animal = new Animal();
        //Polymorphism below
        Animal zebra = new Zebra();
        Animal cheetah = new Cheetah();
        Animal tiger = new Tiger();
        animal.talk();
        tiger.talk();
        zebra.talk();
        cheetah.talk();

        Animal[] animals = new Animal[3];
        animals[0] = new Tiger();
        animals[1] = new Cheetah();
        animals[2] = new Zebra();

        animals[0].talk();
        animals[1].talk();
        animals[2].talk();

    }
}
