package structural.composite;

public class Client {
    public static void main(String[] args) {
        DifficultyLevel level = DifficultyLevel.HARD;
        GameMission mission = new GameMission();
        mission.setGameMission(level);
        Character chrisor = new Character("Chrisor");

        System.out.println("The game level is: " + level);
        chrisor.setExperience(1000L);
        System.out.println("You got 1000 experience.");
        didIWin(mission, chrisor);
        chrisor.addSlainBoss("Morgoth");
        System.out.println("You have slain Morgoth.");
        didIWin(mission, chrisor);
        chrisor.setGold(500L);
        System.out.println("You earned 500 gold.");
        didIWin(mission, chrisor);
        chrisor.addSlainBoss("Zugurosh");
        System.out.println("You slained mighty Zugurosh!");
        didIWin(mission, chrisor);
    }
    public static void didIWin(Mission mission, Character character){
        if(mission.isCompleted(character)){
            System.out.println("You won!");
        } else{
            System.out.println("Keep trying.");
        }
    }


}
