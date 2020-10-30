package structural.composite.concrete_mission;

import structural.composite.Character;
import structural.composite.Mission;

public class SlayBossZuguroshMission implements Mission {
    @Override
    public boolean isCompleted(Character character) {
        return character.getBossesSlain().contains("Zugurosh");
    }
}
