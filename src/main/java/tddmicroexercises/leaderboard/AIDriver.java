package tddmicroexercises.leaderboard;

public class AIDriver implements Driver {

    private String algorithmVersion;
    private String company;

    public String getCompany(){
        return this.company;
    }

    public AIDriver(String algorithmVersion, String company) {
        this.algorithmVersion = algorithmVersion;
        this.company = company;
    }

    public String getAlgorithmVersion() {
        return this.algorithmVersion;
    }

    public void setAlgorithmVersion(String algorithmVersion) {
        this.algorithmVersion = algorithmVersion;
    }

    @Override
    public String getName() {
        return "Self Driving Car - " + this.getCompany() + " (" + this.getAlgorithmVersion() + ")";
    }
}
