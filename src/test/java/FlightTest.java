import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Plane plane1;


    @Before
    public void before() {
        plane1 = new Plane(PlaneType.AIRBUS600);
        flight1 = new Flight(plane1, "FR4466", "EDI", "BRC", "10:30");
    }

    @Test
    public void canReturnNumberOfAvailableSeats() {
        assertEquals(100 ,flight1.availableSeats());
    }
}
