import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Plane plane1;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before() {
        plane1 = new Plane(PlaneType.AIRBUS600);
        flight1 = new Flight(plane1, "FR4466", "EDI", "BRC", "10:30");
        passenger1 = new Passenger("Liam Gallagher",2 );
        passenger2 = new Passenger("Susan Geller",1 );
        passenger3 = new Passenger("Morgan Freeman",1 );
    }

    @Test
    public void canReturnNumberOfAvailableSeats_planeIsEmpty() {
        assertEquals(100 ,flight1.availableSeats());
    }

    @Test
    public void canAddPassenger() {
        flight1.addPassenger(passenger1);
        assertEquals(1, flight1.getNumberOfPassengers());
    }

    @Test
    public void canReturnNumberOfAvailableSeats_planeIsNOTEmpty() {
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        assertEquals(98, flight1.availableSeats());
    }

    @Test
    public void canCalculatePassengerWeightAllowance() {
        assertEquals(10, flight1.passengerWeightAllowance());
    }

    @Test
    public void canCalculateTotalWeightOfBaggage() {
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        flight1.addPassenger(passenger3);
        assertEquals(30,flight1.totalWeightOfBaggage());
    }

}
