package game_logic;

public class Player extends Character {
   public int attackPoints;
   public int speedPoints;
   public int charismaPoints;
   public int defensePoints;

    public Player(String name) {
        super(name, 100, 0);
        this.attackPoints = 0;
        this.defensePoints = 0;
        this.speedPoints = 0;
        this.charismaPoints = 0;
        chooseTrait();
    }

    private void chooseTrait() {
       GameLogic.clearScreen();
       GameLogic.head("Choose a trait ...");
        System.out.println("(1)" + " Attack");
        System.out.println("(2)" + " Defend");
        System.out.println("(3)" + " Speed");
        System.out.println("(4)" + " Charisma");
        int input = GameLogic.getInput(4);
        GameLogic.clearScreen();
        if (input == 1){
            System.out.println("You chose attack");
            attackPoints ++;
        } else if (input == 2) {
            System.out.println("you chose defense");
            defensePoints ++;
        } else if (input == 3) {
            System.out.println("you chose speed");
            defensePoints ++;
        } else if (input == 4) {
            System.out.println("you chose charisma");
            defensePoints ++;
        }
        GameLogic.waitForTheUser();
        GameLogic.clearScreen();
        GameLogic.head("Choose another trait ...");
        System.out.println("(1)" + " Attack");
        System.out.println("(2)" + " Defend");
        System.out.println("(3)" + " Speed");
        System.out.println("(4)" + " Charisma");
        input = GameLogic.getInput(4);
        GameLogic.clearScreen();
        if (input == 1){
            System.out.println("You chose attack");
            attackPoints ++;
        } else if (input == 2) {
            System.out.println("you chose defense");
            defensePoints ++;
        } else if (input == 3) {
            System.out.println("you chose speed");
            speedPoints ++;
        } else if (input == 4) {
            System.out.println("you chose charisma");
            charismaPoints ++;
        }
        GameLogic.waitForTheUser();
    }

    @Override
    public int attack() {
        return 0;
    }
    @Override
    public int defend() {
        return 0;
    }
}
