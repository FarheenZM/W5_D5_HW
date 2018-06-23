import org.junit.Before;
import org.junit.Test;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.junit.Assert.assertEquals;

public class TestBedroom {
    Bedroom bedroom1;
    Bedroom bedroom2;
    BedroomType singleRoom = BedroomType.SINGLE;
    BedroomType doubleRoom = BedroomType.DOUBLE;

    Guest guest1;
    Guest guest2;

    @Before
    public void setUp() throws Exception {
//        could use 1 as capacity arg directly but calling getvalue() on BedroomType var to specifically use the values assigned in BedroomType.
        bedroom1 = new Bedroom(singleRoom.getValue(),101, singleRoom, 40);
        bedroom2 = new Bedroom(doubleRoom.getValue(),102, doubleRoom, 60);

        guest1 = new Guest("Fari", 01);
        guest2 = new Guest("Zacky", 02);
    }

    @Test
    public void testGetCapacity() {
        assertEquals(1, bedroom1.getCapacity());
        assertEquals(2, bedroom2.getCapacity());
    }

    @Test
    public void testGetAvailability() {
        bedroom1.addGuest(guest1);
        assertEquals(FALSE, bedroom1.getAvailability());
    }

    @Test
    public void testSetAvailability() {
        bedroom1.setAvailability(FALSE);
        assertEquals(FALSE, bedroom1.getAvailability());
    }

    @Test
    public void testGetRoomNo() {
        assertEquals(101, bedroom1.getRoomNo());
        assertEquals(102, bedroom2.getRoomNo());
    }

    @Test
    public void testGetType() {
        assertEquals(BedroomType.SINGLE, bedroom1.getType());
        assertEquals(BedroomType.DOUBLE, bedroom2.getType());
    }

    @Test
    public void testGetRate() {
        assertEquals(40, bedroom1.getRate());
        assertEquals(60, bedroom2.getRate());
    }

    @Test
    public void testGetNoOfNights() {
        assertEquals(0, bedroom1.getNoOfNights());
    }

    @Test
    public void testSetNoOfNights() {
        bedroom1.setNoOfNights(4);
        assertEquals(4, bedroom1.getNoOfNights());
    }

    @Test
    public void testGetGuestCountEmpty() {
        assertEquals(0, bedroom1.getGuestCount());
    }

    @Test
    public void testGetGuestCountFull() {
        bedroom1.addGuest(guest1);
        bedroom1.addGuest(guest2);
        assertEquals(1, bedroom1.getGuestCount());
    }

    @Test
    public void testAddGuest() {
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.getGuestCount());
    }

}
