import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> crewMemberArrayList;
    private ArrayList<Passenger> passengerArrayList;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, ArrayList<CabinCrewMember> crewMemberArrayList, ArrayList<Passenger> passengerArrayList, Plane plane,
                  String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilot = pilot;
        this.crewMemberArrayList = crewMemberArrayList;
        this.passengerArrayList = passengerArrayList;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return this.pilot;
    }

    public ArrayList<CabinCrewMember> getCrewMemberArrayList() {
        return this.crewMemberArrayList;
    }

    public ArrayList<Passenger> getPassengerArrayList() {
        return this.passengerArrayList;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public void setCrewMemberArrayList(ArrayList<CabinCrewMember> crewMemberArrayList) {
        this.crewMemberArrayList = crewMemberArrayList;
    }

    public void setPassengerArrayList(ArrayList<Passenger> passengerArrayList) {
        this.passengerArrayList = passengerArrayList;
    }

    public int getCrewListLength() {
        return this.crewMemberArrayList.size();
    }

    public int getPassengerListLength() {
        return this.passengerArrayList.size();
    }

    public void addCrewMember(CabinCrewMember cabinCrewMember) {
        this.crewMemberArrayList.add(cabinCrewMember);
    }

    public int getRemainingSeats(){
        return this.plane.getPlaneType().getCapacity() - this.getPassengerListLength();
    }

    public void addPassenger(Passenger passenger) {
        if (this.getRemainingSeats() > 0) {
            this.passengerArrayList.add(passenger);
        }
    }
}
