package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Character {

    private final String name ;
    private Long gold = 0L;
    private Long experience = 0L;
    private List<String> bossesSlain = new ArrayList<>();

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Long getGold() {
        return gold;
    }

    public void setGold(Long gold) {
        this.gold = gold;
    }

    public Long getExperience() {
        return experience;
    }

    public void setExperience(Long experience) {
        this.experience = experience;
    }

    public List<String> getBossesSlain() {
        return bossesSlain;
    }

    public void addSlainBoss(String boss) {
        bossesSlain.add(boss);
    }
}
