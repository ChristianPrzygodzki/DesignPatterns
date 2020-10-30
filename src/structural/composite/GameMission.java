package structural.composite;

import structural.composite.concrete_mission.Earn500GoldMission;
import structural.composite.concrete_mission.Get1000ExperienceMission;
import structural.composite.concrete_mission.SlayBossMorgothMission;
import structural.composite.concrete_mission.SlayBossZuguroshMission;

import java.util.ArrayList;
import java.util.List;

public class GameMission implements Mission{

    protected List<Mission> missions = new ArrayList<>();

    @Override
    public boolean isCompleted(Character character) {
        for(Mission mission: missions){
            if(!mission.isCompleted(character)){
                return false;
            }
        }
        return true;
    }

    public void addMission(Mission mission){
        if(!missions.contains(mission)){
            missions.add(mission);
        }
    }

    public void removeMission(Mission mission){
        missions.remove(mission);
    }

    public List<Mission> getMissions() {
        return missions;
    }

    public void setGameMission(DifficultyLevel diffLevel){
        switch(diffLevel){
            case EASY:
                missions.add(new Get1000ExperienceMission());
            case MEDIUM:
                missions.add(new SlayBossMorgothMission());
            case HARD:
                missions.add(new SlayBossZuguroshMission());
                missions.add(new Earn500GoldMission());
        }
    }
}
