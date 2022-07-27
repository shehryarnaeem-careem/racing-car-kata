package tddmicroexercises.leaderboard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Race {

    private static final Integer[] POINTS = new Integer[]{25, 18, 15};

    private final String name;
    private final List<Driver> results;
    private final Map<Driver, String> driverNames;

    public Race(String name, Driver... humanDrivers) {
        this.name = name;
        this.results = Arrays.asList(humanDrivers);
        this.driverNames = new HashMap<>();
        for (Driver driver : results) {
            String driverName = driver.getName();
            this.driverNames.put(driver, driverName);
        }
    }

    public int position(Driver humanDriver) {
        return this.results.indexOf(humanDriver);
    }

    public int getPoints(Driver humanDriver) {
        return Race.POINTS[position(humanDriver)];
    }

    public List<Driver> getResults() {
        return results;
    }

    public String getDriverName(Driver humanDriver) {
        return this.driverNames.get(humanDriver);
    }

    @Override
    public String toString() {
        return name;
    }
}
