public class Pilot {

    private String name;
    private Rank rank;
    private String licenceNumber;

    public Pilot(String name, Rank rank, String licenceNumber) {
        this.name = name;
        this.rank = rank;
        this.licenceNumber = licenceNumber;
    }

    public String getName() {
        return this.name;
    }

    public Rank getRank() {
        return this.rank;
    }

    public String getLicenceNumber() {
        return this.licenceNumber;
    }


    public String flyPlane() {
        return "Woooo we're flying!";
    }
}
