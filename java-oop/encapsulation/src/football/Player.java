package football;

public class Player {

    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    public double overallSkillLevel() {
        return (endurance + sprint + dribble + passing + shooting) / 5.0;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty() || name.equals(" ")) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    private void setShooting(int shooting) {
        ensureStat(shooting, "Shooting");
        this.shooting = shooting;
    }

    private void setPassing(int passing) {
        ensureStat(passing, "Passing");
        this.passing = passing;
    }

    private void setDribble(int dribble) {
        ensureStat(dribble, "Dribble");
        this.dribble = dribble;
    }

    private void setSprint(int sprint) {
        ensureStat(sprint, "Sprint");
        this.sprint = sprint;
    }

    private void setEndurance(int endurance) {
        ensureStat(endurance, "Endurance");
        this.endurance = endurance;
    }

    private void ensureStat(int statValue, String statName) {
        if (statValue < 0 || statValue > 100) {
            throw new IllegalArgumentException(statName + " should be between 0 and 100.");
        }
    }
}
