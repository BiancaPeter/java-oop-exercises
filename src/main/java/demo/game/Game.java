package demo.game;

public class Game {
    public static void main(String[] args) {
//        PlayerCharacter player1 = new PlayerCharacter("Bianca", 31);
//        player1.speak();
//        System.out.println(player1.getName());
//        player1.setName("Olimpiu");
//        System.out.println(player1.getName());

        Archer archer1 = new Archer("John",34,1, 50);
        archer1.speak();

        Wizard wizard1 = new Wizard("Ela",50,1,5);
        wizard1.speak();

//        System.out.println(wizard1 instanceof PlayerCharacter);
//        System.out.println(wizard1 instanceof Wizard);
//        System.out.println(wizard1 instanceof Object);

        archer1.attack();
        wizard1.attack();

        playerAttack(archer1);
        playerAttack(wizard1);

        archer1.levelUp();
        wizard1.levelUp();

        System.out.println(archer1.getCurrentLevel());
        System.out.println(archer1.getNumberOfArrows());
        System.out.println(wizard1.getCurrentLevel());

    }

    public static void playerAttack(PlayerCharacter playerCharacter){
        playerCharacter.attack();
    }

}

