import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Flight flight;
    private Pilot pilot;
    private ArrayList<Passenger> passengerArrayList;
    private ArrayList<CabinCrewMember> crewMemberArrayList;
    private Plane plane;
    private Passenger passenger;

    @Before
    public void before(){
        pilot = new Pilot("Clarence Oveur", Rank.CAPTAIN, "DD00000D");
        plane = new Plane(PlaneType.BOEING777);
        passengerArrayList = new ArrayList<>();
        crewMemberArrayList = new ArrayList<>();
        flight = new Flight(pilot, crewMemberArrayList, passengerArrayList, plane, "ZAZ80", "ORD", "LAX", "18:30");

        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);

        flightManager = new FlightManager("Johnny Henshaw-Jacobs");
    }

    @Test
    public void hasName(){
        assertEquals("Johnny Henshaw-Jacobs", flightManager.getName());
    }

    @Test
    public void canGetTotalWeightReservedForPassengerBags(){
        assertEquals(2000, flightManager.getWeightReservedForPassengerBags(flight), 0.00);
    }

    @Test
    public void canGetBaggageWeightReservedForEachPassenger(){
        assertEquals(3.64, flightManager.getWeightOfBagPerPassenger(flight), 0.00);
    }

    @Test
    public void canGetBaggageWeightByBookedPassengers(){
        assertEquals(18.2, flightManager.getBookedBaggageWeight(flight), 0.00);
    }

    @Test
    public void canGetRemainingWeightReservedForBaggage(){
        assertEquals(1981.8, flightManager.getRemainingWeight(flight), 0.00);
    }
}
