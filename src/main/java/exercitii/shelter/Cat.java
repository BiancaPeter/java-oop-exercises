package exercitii.shelter;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Pisica " + getName() + " face miau.");
    }
}
