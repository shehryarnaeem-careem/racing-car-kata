package tddmicroexercises.leaderboard;

public class TestData {

    public static Driver humanDriver1;
    public static Driver humanDriver2;
    public static Driver humanDriver3;
    public static AIDriver driver4;

    public static Race race1;
    public static Race race2;
    public static Race race3;
    public static Race race4;
    public static Race race5;
    public static Race race6;

    public static Leaderboard sampleLeaderboard1;
    public static Leaderboard sampleLeaderboard2;

    static {
        humanDriver1 = new HumanDriver("Nico Rosberg", "DE");
        humanDriver2 = new HumanDriver("Lewis Hamilton", "UK");
        humanDriver3 = new HumanDriver("Sebastian Vettel", "DE");
        driver4 = new AIDriver("1.2", "Acme");

        race1 = new Race("Australian Grand Prix", humanDriver1, humanDriver2, humanDriver3);
        race2 = new Race("Malaysian Grand Prix", humanDriver3, humanDriver2, humanDriver1);
        race3 = new Race("Chinese Grand Prix", humanDriver2, humanDriver1, humanDriver3);
        race4 = new Race("Fictional Grand Prix 1", humanDriver1, humanDriver2, driver4);
        race5 = new Race("Fictional Grand Prix 2", driver4, humanDriver2, humanDriver1);
        driver4.setAlgorithmVersion("1.3");
        race6 = new Race("Fictional Grand Prix 3", humanDriver2, humanDriver1, driver4);

        sampleLeaderboard1 = new Leaderboard(race1, race2, race3);
        sampleLeaderboard2 = new Leaderboard(race4, race5, race6);
    }
}
