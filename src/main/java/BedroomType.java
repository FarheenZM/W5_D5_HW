public enum BedroomType {

    SINGLE(1),
    DOUBLE(2);

   private int value;

    BedroomType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
