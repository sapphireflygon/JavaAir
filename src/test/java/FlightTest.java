import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;
    private Pilot pilot;
    private Passenger passenger;
    private CabinCrewMember cabinCrewMember;
    private ArrayList<CabinCrewMember> crewList;
    private ArrayList<Passenger> passengerList;

    @Before
    public void before(){
        plane = new Plane(PlaneType.TESTPLANE);
        pilot = new Pilot("Otto Pilot", Rank.CAPTAIN, "AA000000C");
        cabinCrewMember = new CabinCrewMember("Elaine Dickinson", Rank.FLIGHT_ATTENDANT);
        passenger = new Passenger("Dr Rumack", 2);
        crewList = new ArrayList<>();
        passengerList = new ArrayList<>();
        flight = new Flight(pilot, crewList, passengerList, plane, "ZAZ80", "ORD", "LAX", "18:30");
    }

    @Test
    public void hasPilot(){
        assertEquals(pilot, flight.getPilot());
    }

    @Test
    public void hasCrewList(){
        assertEquals(crewList, flight.getCrewMemberArrayList());
    }

    @Test
    public void hasPassengerList(){
        assertEquals(passengerList, flight.getPassengerArrayList());
    }

    @Test
    public void hasPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("ZAZ80", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("ORD", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("LAX", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("18:30", flight.getDepartureTime());
    }

    @Test
    public void canGetLengthOfCrewList(){
        assertEquals(0, flight.getCrewListLength());
    }

    @Test
    public void canGetLengthOfPassengerList(){
        assertEquals(0, flight.getPassengerListLength());
    }

    @Test
    public void canGetRemainingSeats(){
        assertEquals(3, flight.getRemainingSeats());
    }

    @Test
    public void canAddCrewMemberToCrewList(){
        flight.addCrewMember(cabinCrewMember);
        assertEquals(1, flight.getCrewListLength());
    }

    @Test
    public void canAddPassengerToPassengerList(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.getPassengerListLength());
    }

    @Test
    public void willNotAddPassengerIfNoRemainingSeats(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(3, flight.getPassengerListLength());
    }
}
