import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Flight extends FlightManager {
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        passengers = new ArrayList<Passenger>();

    }

    public int getNumberOfPassengers() {
        return passengers.size();
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getFlightCapacity() {
        return this.plane.getPlaneType().getCapacity();
    }

    public int availableSeats() {
        return this.getFlightCapacity() - this.getNumberOfPassengers();
    }


    public void addPassenger(Passenger newPassenger) {
        if(!passengers.contains(newPassenger)) {
            passengers.add(newPassenger);
        }
    }

    public int passengerWeightAllowance() {
        int totalWeight = this.getPlane().getPlaneType().getTotalWeight();
        int planeCapacity = this.getPlane().getPlaneType().getCapacity();
        return (totalWeight/2) / planeCapacity;
    }

    public int totalWeightOfBaggage() {
       return this.passengerWeightAllowance() * this.getNumberOfPassengers();
    }

    public int unusedBaggageWeight() {
        int planeCapacity = this.getPlane().getPlaneType().getCapacity();
        return planeCapacity - this.totalWeightOfBaggage();
    }

}




