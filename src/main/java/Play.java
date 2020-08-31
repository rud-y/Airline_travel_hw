import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Play {

    public static void main(String[] args) {
        Date date = new GregorianCalendar(2020, Calendar.SEPTEMBER,22).getTime();
        Passenger passenger1 = new Passenger("Donald", 2);
        Passenger passenger2 = new Passenger("Susan", 1);
        Passenger passenger3 = new Passenger("Abby", 1);
        Plane plane1 = new Plane(PlaneType.BOEING737);
        Flight flight1 = new Flight(plane1, "FR4466", "EDI", "BRC", date);
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        flight1.addPassenger(passenger3);

        //
        System.out.println("Number of passengers on flight number "
                + flight1.getFlightNumber() + " is " + flight1.getNumberOfPassengers());


        System.out.println("plane1 capacity is " + plane1.getPlaneType().getCapacity());
        System.out.println("plane1 info: " + plane1.getPlaneType() + ", capacity: " + plane1.getPlaneType().getCapacity()
                + " seats, " + " weight: " + plane1.getPlaneType().getTotalWeight() + " kg.");

        System.out.println("Passengers are on flight-- " + passenger1.getFlight());


    }
}