import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Stevie Budd", Rank.CAPTAIN, "AA123456C");
    }

    @Test
    public void hasName(){
        assertEquals("Stevie Budd", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void hasPilotLicenceNumber(){
        assertEquals("AA123456C", pilot.getLicenceNumber());
    }

    @Test
    public void canFlyThePlane(){
        assertEquals("Woooo we're flying!", pilot.flyPlane());
    }
}
