
import java.util.ArrayList;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;
    private boolean available;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.available = TRUE;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean getAvailability() {
        return this.available;
    }

    public ArrayList<Guest> getGuests() {
        return this.guests;
    }

    public void setAvailability(boolean available) {
        this.available = available;
    }

    public int getGuestCount() {
        return guests.size();
    }

    public void addGuest(Guest guest) {
        if (getGuestCount() < getCapacity()) {
            guests.add(guest);
            this.available = FALSE;
        }
    }

    public void removeGuest() {
        this.guests.clear();
    }

}
