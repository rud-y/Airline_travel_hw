import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Flight flight;
    Plane plane;
    Date date;

    @Before
    public void before() {
        passenger = new Passenger("Mike Furr", 1);
        flight = new Flight(plane, "FR4466", "EDI", "BRC", date);
        date = new GregorianCalendar(2020,Calendar.OCTOBER, 10).getTime();
        plane = new Plane(PlaneType.AIRBUS600);
    }

    @Test
    public void hasName() {
        assertEquals("Mike Furr", passenger.getName());
    }

    @Test
    public void canSetFlight() {
        passenger.setFlight(flight);
        assertEquals(flight, passenger.getFlight());
    }

    @Test
    public void canGetFlight() {
        passenger.setFlight(flight);
        assertEquals(flight, passenger.getFlight());
    }



}
