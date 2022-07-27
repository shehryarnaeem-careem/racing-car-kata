package tddmicroexercises.leaderboard;

public class HumanDriver implements Driver {

    private final String name;
    private final String country;
    private static Integer HASHING_FACTOR = 31;

    public HumanDriver(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public int hashCode() {
        return name.hashCode() * HASHING_FACTOR + country.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof HumanDriver)) {
            return false;
        }
        HumanDriver other = (HumanDriver) obj;
        return this.name.equals(other.name) && this.country.equals(other.country);
    }
}
