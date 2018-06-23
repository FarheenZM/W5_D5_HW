import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuest {

    Guest guest1;
    Guest guest2;

    @Before
    public void setUp() throws Exception {
        guest1 = new Guest("Fari", 01);
        guest2 = new Guest("Zacky", 02);
    }

    @Test
    public void testGetName() {
        assertEquals("Fari", guest1.getName());
    }

    @Test
    public void testGetId() {
        assertEquals(02, guest2.getId());
    }
}
