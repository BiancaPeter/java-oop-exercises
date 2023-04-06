package exercitii.animals;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greeting() {
        System.out.println(this.getName() + " latra Woof!");
    }

    public void greeting(Dog anotherDog) {
        System.out.println(this.getName() + " latra Wooooooooof! catre " + anotherDog.getName());
    }
}
