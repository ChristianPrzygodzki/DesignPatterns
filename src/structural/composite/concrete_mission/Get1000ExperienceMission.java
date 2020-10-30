package structural.composite.concrete_mission;

import structural.composite.Character;
import structural.composite.Mission;

public class Get1000ExperienceMission implements Mission {
    @Override
    public boolean isCompleted(Character character) {
        return character.getExperience() >= 1000;
    }
}
