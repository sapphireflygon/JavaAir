import java.text.DecimalFormat;

public class FlightManager {

    private String name;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public FlightManager(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getWeightReservedForPassengerBags(Flight flight){
        String weight = df.format(flight.getPlane().getPlaneType().getTotalWeight() / 2);
        return Double.parseDouble(weight);
    }

    public double getWeightOfBagPerPassenger(Flight flight){
        int capacity = flight.getPlane().getPlaneType().getCapacity();
        String weight = df.format(this.getWeightReservedForPassengerBags(flight) / capacity);
        return Double.parseDouble(weight);
    }

    public double getBookedBaggageWeight(Flight flight) {
        double weight = this.getWeightOfBagPerPassenger(flight);
        int numberOfBookedPassengers = flight.getPassengerListLength();
        return weight * numberOfBookedPassengers;
    }

    public double getRemainingWeight(Flight flight) {
        double bookedWeight = this.getBookedBaggageWeight(flight);
        double weightReserved = this.getWeightReservedForPassengerBags(flight);
        return weightReserved - bookedWeight;
    }
}
