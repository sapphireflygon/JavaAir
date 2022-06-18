import java.text.DecimalFormat;

public enum PlaneType {
    BOEING737(215, 1000),
    BOEING747(605, 5000),
    BOEING767(375, 3000),
    BOEING777(550, 4000),
    BOEING787(330, 2000),
    TESTPLANE(3, 50);

    private final int capacity;
    private final double totalWeight;

    PlaneType(int capacity, double totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public double getTotalWeight() {
        return this.totalWeight;
    }
}
