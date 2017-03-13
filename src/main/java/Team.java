
public class Team {

    private String name;
    private int teamRate;


    public Team(String name, int teamRate) {
    this.name = name;
    this.teamRate = teamRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTeamRate() {
        return teamRate;
    }

    public void setTeamRate(int teamRate) {
        this.teamRate = teamRate;
    }

    Team Barca = new Team("Barcelona", 1);
    Team Atletico = new Team("Atletico Madrid", 2);
    Team Celta = new Team("Celta", 4);

    public int diff = Barca.teamRate - Celta.teamRate;

    public Team getBarca() {
        return Barca;
    }

    public Team getAtletico() {
        return Atletico;
    }

    public Team getCelta() {
        return Celta;
    }
}
