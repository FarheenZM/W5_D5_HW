import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConferenceRoom {
    ConferenceRoom conferenceRoom;

    @Before
    public void setUp() throws Exception {
        conferenceRoom = new ConferenceRoom(100, "Party Hall", 500 );
    }

    @Test
    public void testGetCapacity() {
        assertEquals(100, conferenceRoom.getCapacity());
    }

    @Test
    public void testGetName() {
        assertEquals("Party Hall", conferenceRoom.getName());
    }

    @Test
    public void testGetDailyRate() {
        assertEquals(500, conferenceRoom.getDailyRate());
    }


}
