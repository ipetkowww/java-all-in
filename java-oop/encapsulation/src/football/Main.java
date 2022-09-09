package football;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Team> teams = new HashMap<>();

        while (!input.equals("END")) {
            String[] tokens = input.split(";");
            String command = tokens[0];
            String teamName = tokens[1];

            switch (command) {
                case "Team":
                    addTeam(teams, teamName);
                    break;
                case "Add":
                    addPlayer(teams, tokens, teamName);
                    break;
                case "Remove":
                    removePlayer(teams, tokens, teamName);
                    break;
                case "Rating":
                    rateTeam(teams, teamName);
                    break;
            }
            input = scanner.nextLine();
        }
    }

    private static void rateTeam(Map<String, Team> teams, String teamName) {
        if (teams.get(teamName) == null) {
            System.out.println("Team " + teamName + " does not exist.");
        } else {
            System.out.println(teamName + " - " + Math.round(teams.get(teamName).getRating()));
        }
    }

    private static void removePlayer(Map<String, Team> teams, String[] playerInfo, String teamName) {
        try {
            String playerToRemove = playerInfo[2];
            teams.get(teamName).removePlayer(playerToRemove);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void addPlayer(Map<String, Team> teams, String[] playerInfo, String teamName) {
        Team team = teams.get(teamName);
        if (team == null) {
            System.out.println("Team " + teamName + " does not exist.");
        } else {
            try {
                String name = playerInfo[2];
                int endurance = Integer.parseInt(playerInfo[3]);
                int sprint = Integer.parseInt(playerInfo[4]);
                int dribble = Integer.parseInt(playerInfo[5]);
                int passing = Integer.parseInt(playerInfo[6]);
                int shooting = Integer.parseInt(playerInfo[7]);
                Player player = new Player(name, endurance, sprint, dribble, passing, shooting);
                team.addPlayer(player);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void addTeam(Map<String, Team> teams, String teamName) {
        Team team = teams.get(teamName);
        if (team == null) {
            team = new Team(teamName);
        }
        teams.put(teamName, team);
    }
}
