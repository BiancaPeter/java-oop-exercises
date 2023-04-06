package exercitii.animals;

public class TestAnimal {
    public static void main(String[] args) {
        //varianta in care definit variabila de tip Cat si Dog si nu avem nevoie de casting
//        Cat cat = new Cat("Pisi");
//        cat.greeting();
//        Dog dog = new Dog("Azor");
//        dog.greeting();
//        SecurityDog securityDog = new SecurityDog("Ricky");
//        securityDog.greeting();
//        dog.greeting(securityDog);
//        securityDog.greeting(dog);

        //varianta in care definim variabilele de tip Animal si avem nevoie de casting
        Animal cat = new Cat("Pisi");
        cat.greeting();
        Animal dog = new Dog("Azor");
        dog.greeting();
        Animal securityDog = new SecurityDog("Ricky");
        securityDog.greeting();
        Dog dog1 = (Dog) dog;
        SecurityDog securityDog1 = (SecurityDog) securityDog;
        dog1.greeting(securityDog1);
        securityDog1.greeting(dog1);
    }
}
