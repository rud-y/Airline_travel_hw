
public class Play {

    public static void main(String[] args) {
        Passenger passenger1 = new Passenger("Donald", 2);
        Passenger passenger2 = new Passenger("Susan", 1);
        Passenger passenger3 = new Passenger("Abby", 1);
        Plane plane1 = new Plane(PlaneType.BOEING737);
        Flight flight1 = new Flight(plane1, "FR4466", "EDI", "BRC", "2020-09-25 10:30:00");
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        flight1.addPassenger(passenger3);

        //
        System.out.println("Number of passengers on flight number "
                + flight1.getFlightNumber() + " is " + flight1.getNumberOfPassengers());


        System.out.println("plane1 capacity is " + plane1.getPlaneType().getCapacity());
        System.out.println("plane1 info: " + plane1.getPlaneType() + ", capacity: " + plane1.getPlaneType().getCapacity()
                + " seats, " + " weight: " + plane1.getPlaneType().getTotalWeight() + " kg.");



    }
}