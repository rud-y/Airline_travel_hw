public enum PlaneType {

    BOEING747(130, 80), //weights in tons
    BOEING737(120, 80),
    AIRBUS600(100, 70);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
