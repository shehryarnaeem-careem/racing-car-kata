package tddmicroexercises.leaderboard;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static tddmicroexercises.leaderboard.TestData.humanDriver1;
import static tddmicroexercises.leaderboard.TestData.humanDriver2;
import static tddmicroexercises.leaderboard.TestData.humanDriver3;

public class LeaderboardTest {

    @Test
    public void itShouldSumThePoints() {
        // setup

        // act
        Map<String, Integer> results = TestData.sampleLeaderboard1.driverResults();

        // verify
        assertTrue("results " + results, results.containsKey("Lewis Hamilton"));
        assertEquals(18 + 18 + 25, (int) results.get("Lewis Hamilton"));
    }

    @Test
    public void isShouldFindTheWinner() {
        // setup

        // act
        List<String> result = TestData.sampleLeaderboard1.driverRankings();

        // verify
        assertEquals("Lewis Hamilton", result.get(0));
    }

    @Test
    public void itShouldKeepAllDriversWhenSamePoints() {
        // setup
        // bug, drops drivers with same points
        Race winDriver1 = new Race("Australian Grand Prix", humanDriver1, humanDriver2, humanDriver3);
        Race winDriver2 = new Race("Malaysian Grand Prix", humanDriver2, humanDriver1, humanDriver3);
        Leaderboard exEquoLeaderBoard = new Leaderboard(winDriver1, winDriver2);

        // act
        List<String> rankings = exEquoLeaderBoard.driverRankings();

        // verify
        assertEquals(Arrays.asList(humanDriver1.getName(), humanDriver2.getName(), humanDriver3.getName()), rankings);
        // note: the order of driver1 and driver2 is JDK/platform dependent
    }

}
