import java.util.ArrayList;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<DiningRoom> diningRooms;

    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.diningRooms = new ArrayList<DiningRoom>();
    }

    public String getName() {
        return this.name;
    }

    public void addBedroom(Bedroom room) {
        bedrooms.add(room);
    }

    public void addConferenceRoom(ConferenceRoom room) {
        conferenceRooms.add(room);
    }

    public void addDiningRoom(DiningRoom room) {
        diningRooms.add(room);
    }

    public void checkinGuestToConferenceRoom(Guest guest) {
        for(ConferenceRoom room : conferenceRooms) {
            if(room.getAvailability()) {
                room.addGuest(guest);
            }
        }
    }

    public void checkinGuestToBedroom(Guest guest, BedroomType type, int nights) {
        for(Bedroom room : bedrooms) {
            if(room.getType() == type && room.getAvailability()) {
                room.addGuest(guest);
                room.setNoOfNights(nights);
            }
        }
    }

    public void checkoutGuestFromBedroom(Bedroom room) {
        room.setAvailability(TRUE);
        room.removeGuest();
        room.setNoOfNights(0);

    }

    public String listGuestsCheckedinToARoom(Room room) {
        String guestNames = "";
        for (Guest guest : room.getGuests()) {
            guestNames += guest.getName() + ",";
        }
        return guestNames;
    }

    public String listOfVacantBedrooms(){
        String vacantRooms = "";
        for(Bedroom room : bedrooms) {
            if (room.getAvailability() == TRUE) {
                vacantRooms += room.getRoomNo() + ",";
            }
        }
        return vacantRooms;
    }
}
