package football;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private final List<Player> players;

    public Team(String name) {
        setName(name);
        players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(String playerName) {
        Player player = players.stream().filter(p -> p.getName().equals(playerName)).findFirst().orElse(null);
        if (player == null) {
            throw new IllegalArgumentException("Player " + playerName + " is not in " + getName() + " team.");
        }
        players.remove(player);
    }

    public double getRating() {
        return players.stream().mapToDouble(Player::overallSkillLevel).average().orElse(0.0);
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
}
