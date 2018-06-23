import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDiningRoom {
    DiningRoom diningRoom;

    @Before
    public void setUp() throws Exception {
        diningRoom = new DiningRoom(25, "Diner");
    }

    @Test
    public void testGetCapacity() {
        assertEquals(25, diningRoom.getCapacity());
    }

    @Test
    public void testGetName() {
        assertEquals("Diner", diningRoom.getName());
    }

}
