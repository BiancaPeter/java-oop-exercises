package exercitii.animals;

public class SecurityDog extends Dog {

    public SecurityDog(String name) {
        super(name);
    }

    @Override
    public void greeting() {
        System.out.println(this.getName() + " latra Woow!");
    }

    @Override
    public void greeting(Dog anotherDog) {
        System.out.println(this.getName() + " latra Woooooowwwww! catre " + anotherDog.getName());
    }
}
