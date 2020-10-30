package structural.composite.concrete_mission;

import structural.composite.Character;
import structural.composite.Mission;

public class SlayBossMorgothMission implements Mission {

    @Override
    public boolean isCompleted(Character character) {
        return character.getBossesSlain().contains("Morgoth");
    }
}
