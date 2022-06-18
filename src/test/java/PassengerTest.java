import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Moira Rose", 7);
    }

    @Test
    public void hasName(){
        assertEquals("Moira Rose", passenger.getName());
    }

    @Test
    public void hasNumberOfBags(){
        assertEquals(7, passenger.getNumberOfBags());
    }
}
