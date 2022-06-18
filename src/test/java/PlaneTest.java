import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void hasPlaneType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void hasPlaneTypeCapacity(){
        assertEquals(605, plane.getPlaneType().getCapacity());
    }

    @Test
    public void hasPlaneTypeTotalWeight(){
        assertEquals(5000, plane.getPlaneType().getTotalWeight(), 0.00);
    }
}
