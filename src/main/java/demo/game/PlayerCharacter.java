package demo.game;

public abstract class PlayerCharacter {
    private String name;
    private int age;
    private int currentLevel;

    public PlayerCharacter(String name, int age, int currentLevel) {
        this.name = name;
        this.age = age;
        this.currentLevel = currentLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public void run() {
        System.out.println("Player is running");
    }

    public void speak() {
        System.out.println("My name is " + this.name + " and I am " + this.age + ".");
    }

    public abstract void attack();


}
