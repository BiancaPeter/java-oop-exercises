package exercitii.shelter;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Azor",2);
        Cat cat1 = new Cat("Tom",1);
        Animal[] animals = new Animal[2];
        Shelter shelter = new Shelter(animals);
        shelter.addAnimal(dog1);
        shelter.addAnimal(cat1);
        shelter.makeNoise();
    }
}
