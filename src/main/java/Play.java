public class Play {

    public static void main(String[] args) {
        Plane plane1 = new Plane(PlaneType.BOEING737);
        Flight flight1 = new Flight(plane1, "FR4466", "EDI", "BRC", "10:30");

        System.out.println("plane1 has " +plane1.getPlaneType()
                .getTotalWeight() + " tons!");

        System.out.println("plane1 capacity " +plane1.getPlaneType().getCapacity());
        System.out.println("plane1 info: " +plane1.getPlaneType() + ", capacity: " + plane1.getPlaneType().getCapacity()
        + "seats, " + " weight: " +plane1.getPlaneType().getTotalWeight() + " tons.");

        //just play:::::
        System.out.println(flight1.getPassengers().toString());
    }
}
