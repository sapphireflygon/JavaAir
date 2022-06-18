import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    private CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Alexis Rose", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasName(){
        assertEquals("Alexis Rose", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void canRelayMessagesToPassengers(){
        assertEquals("Ew, David!", cabinCrewMember.relayMessage("Ew, David!"));
    }
}
