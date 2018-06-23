import static java.lang.Boolean.FALSE;

public class Bedroom extends Room {

    private int roomNo;
    private BedroomType type;
    private int rate;
    private int noOfNights;

    public Bedroom(int capacity, int roomNo, BedroomType type, int rate) {
        super(capacity);
        this.roomNo = roomNo;
        this.type = type;
        this.rate = rate;
        this.noOfNights = 0;
    }

    public int getRoomNo() {
        return this.roomNo;
    }

    public BedroomType getType() {
        return this.type;
    }

    public int getRate() {
        return this.rate;
    }

    public int getNoOfNights() {
        return this.noOfNights;
    }

    public void setNoOfNights(int noOfNights) {
        this.noOfNights = noOfNights;
    }

}
