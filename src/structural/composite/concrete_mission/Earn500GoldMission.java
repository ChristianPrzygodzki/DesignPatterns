package structural.composite.concrete_mission;

import structural.composite.Character;
import structural.composite.Mission;

public class Earn500GoldMission implements Mission {
    @Override
    public boolean isCompleted(Character character) {
        return character.getGold() >= 500;
    }
}
