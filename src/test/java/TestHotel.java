import org.junit.Before;
import org.junit.Test;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static javafx.scene.input.KeyCode.F;
import static org.junit.Assert.assertEquals;

public class TestHotel {
    Hotel hotel;

    Bedroom bedroom1;
    Bedroom bedroom2;

    BedroomType singleRoom = BedroomType.SINGLE;
    BedroomType doubleRoom = BedroomType.DOUBLE;

    Guest guest1;
    Guest guest2;

    @Before
    public void setUp() throws Exception {
        hotel = new Hotel("CodeClan Towers");

        bedroom1 = new Bedroom(singleRoom.getValue(),101, singleRoom, 40);
        bedroom2 = new Bedroom(doubleRoom.getValue(),102, doubleRoom, 60);

        guest1 = new Guest("Fari", 01);
        guest2 = new Guest("Zacky", 02);

    }

    @Test
    public void testGetName() {
        assertEquals("CodeClan Towers", hotel.getName());
    }

    @Test
    public void testCheckinGuestToBedroom() {
        hotel.addBedroom(bedroom1);
        hotel.checkinGuestToBedroom(guest1, BedroomType.SINGLE, 1);
        assertEquals(FALSE, bedroom1.getAvailability());
        assertEquals(1, bedroom1.getNoOfNights());
    }

    @Test
    public void testCheckoutGuestToBedroom() {
        hotel.addBedroom(bedroom1);
        hotel.checkinGuestToBedroom(guest1, BedroomType.SINGLE, 1);
        hotel.checkoutGuestFromBedroom(bedroom1);
        assertEquals(TRUE, bedroom1.getAvailability());
        assertEquals(0, bedroom1.getNoOfNights());
    }

    @Test
    public void testGuestsInARoom() {
        hotel.addBedroom(bedroom2);
        hotel.checkinGuestToBedroom(guest2, BedroomType.DOUBLE, 1);
        String result = hotel.listGuestsCheckedinToARoom(bedroom2);
        assertEquals("Zacky,", result);
    }

    @Test
    public void testListOfVacantBedrooms() {
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        assertEquals("101,102,", hotel.listOfVacantBedrooms());
    }
}
